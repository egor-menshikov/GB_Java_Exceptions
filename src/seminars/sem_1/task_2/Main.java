package seminars.sem_1.task_2;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {{1, 0, 1}, {0, 1, 0}, {1, 0, 1}};
        System.out.println(arrSum(arr));
    }

    public static int arrSum(int[][] arr) {
        if (arr.length != arr[0].length) throw new RuntimeException("Массив не квадратный");
        int result = 0;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt == 0 || anInt == 1)
                    result += anInt;
                else throw new RuntimeException("Элемент не равен 0 или 1");
            }
        }
        return result;
    }
}
