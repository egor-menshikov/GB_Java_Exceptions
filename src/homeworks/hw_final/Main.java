package homeworks.hw_final;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            String[] text = getUserData();
        } catch (ArraySizeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String prepareUserData(String[] text) {
        checkNames(text[0], text[1], text[2]);
    }

    private static void checkNames(String s1, String s2, String s3) {
        if (!s1.matches("^[a-zA-Zа-яА-Я]*$"))
            throw new MyArraySizeException();
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
