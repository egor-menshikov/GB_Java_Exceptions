package homeworks.hw_3.task_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ваше число: " + returnFloat());
    }

    public static float returnFloat() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число float:");
        try {
            return sc.nextFloat();
        } catch (InputMismatchException e) {
            return returnFloat();
        }
    }
}
