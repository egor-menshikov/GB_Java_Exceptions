package seminars.sem_1.task_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getNum();
    }

    public static int arrFinder(int[] arr, int num) {
        if (arr == null) return -3;
        if (arr.length < 3) return -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) return i;
        }
        return -2;
    }

    public static void getNum() {
        int[] arr = {1, 5, 7};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int num = sc.nextInt();
        int result = arrFinder(arr, num);
        switch (result) {
            case -3 -> System.out.println("null array");
            case -2 -> System.out.println("no such element");
            case -1 -> System.out.println("array too short");
            default -> System.out.printf("this number is at %d index", result);
        }
    }
}
