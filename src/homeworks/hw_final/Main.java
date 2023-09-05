package homeworks.hw_final;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        try {
//            String[] text = getUserData();
//        } catch (ArraySizeException e) {
//            System.out.println(e.getMessage());
//        }
        String d = "21.02.2023";
        String e = "19.02-2024";
        String f = "21.02.2023";
        LocalDate date = LocalDate.parse(d, DateTimeFormatter.ofPattern("dd.MM.uuuu"));
        System.out.println(date);
        LocalDate date1 = LocalDate.parse(e, DateTimeFormatter.ofPattern("dd.MM.uuuu"));
        LocalDate date2 = LocalDate.parse(f, DateTimeFormatter.ofPattern("dd.MM.uuuu"));
        System.out.println(date1.compareTo(date));
    }

    public static String prepareUserData(String[] text) {
        try {
            checkNames(text[0], text[1], text[2]);
            checkDate(text[3]);
        } catch (WrongDataException e) {
            System.out.println(e.getMessage());
        }

    }

    private static void checkDate(String s) throws WrongDataException {
        LocalDate today = LocalDate.of(2023,9, 5);
        try {
            LocalDate date = LocalDate.parse(s, DateTimeFormatter.ofPattern("dd.MM.uuuu"));
            if (date.isAfter(today)) {
                throw new WrongDataException("Дата указана неверно.");
            }
        } catch (DateTimeParseException e) {
            System.out.println("Дата введена в неверном формате.");
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
