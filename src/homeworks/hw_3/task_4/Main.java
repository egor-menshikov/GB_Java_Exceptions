package homeworks.hw_3.task_4;

//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
//Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            inputString();
        } catch (Exception e) {
            System.out.println("Пустые строки вводить нельзя!");
        }
    }

    public static void inputString() throws Exception {
        System.out.println("Введите строку: ");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        if (text.equalsIgnoreCase(""))
            throw new Exception();
        System.out.println("Вы молодец, ввели не пустую строку!");
    }
}
