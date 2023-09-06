package homeworks.hw_final;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            String[] text = getUserData();
            prepareUserData(text);
            writeToFile(text);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ArraySizeException | WrongDataException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void writeToFile(String[] text) throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length; i++) {
            if (i < text.length - 1)
                sb.append(text[i]).append(" ");
            else
                sb.append(text[i]);
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(text[0].toLowerCase() + ".txt", true))) {
            bw.write(sb.toString());
            bw.newLine();
        }
    }

    public static void prepareUserData(String[] text) throws WrongDataException {
        checkNames(text[0], text[1], text[2]);
        checkDate(text[3]);
        checkPhone(text[4]);
        checkGender(text[5]);
    }

    private static void checkGender(String s) throws WrongDataException {
        if (s.equalsIgnoreCase("m") || s.equalsIgnoreCase("f"))
            return;
        throw new WrongDataException("Пол указан неверно");
    }

    private static void checkPhone(String s) throws WrongDataException {
        if (s.length() != 11 || !s.matches("^[0-9]*$"))
            throw new WrongDataException("Телефон указан неверно.");
    }

    private static void checkDate(String s) throws WrongDataException {
        LocalDate today = LocalDate.of(2023, 9, 5);
        try {
            LocalDate date = LocalDate.parse(s, DateTimeFormatter.ofPattern("dd.MM.uuuu"));
            if (date.isAfter(today)) {
                throw new WrongDataException("Дата указана неверно.");
            }
        } catch (DateTimeParseException e) {
            throw new WrongDataException("Дата была указана в неверном формате.");
        }
    }

    private static void checkNames(String s1, String s2, String s3) throws WrongDataException {
        if (!s1.matches("^[a-zA-Zа-яА-Я]*$"))
            throw new WrongDataException("Фамилия введена неверно.");
        if (!s2.matches("^[a-zA-Zа-яА-Я]*$"))
            throw new WrongDataException("Имя введено неверно.");
        if (!s3.matches("^[a-zA-Zа-яА-Я]*$"))
            throw new WrongDataException("Отчество введено неверно.");
    }


    public static String[] getUserData() throws ArraySizeException {
        System.out.println("Введите данные в формате:\n" +
                "<Фамилия> <Имя> <Отчество> <дата рождения (dd.mm.yy)> <номер телефона (8**********)> <пол (f/m)>");
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        String[] result = data.split(" ");
        if (result.length != 6) throw new ArraySizeException(result, 6);
        return result;
    }
}
