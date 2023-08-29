package seminars.sem_1.task_0;

public class Main {
    public static void main(String[] args) {
        System.out.println(arrLength(new int[]{1, 6, 2}));
    }

    public static int arrLength (int[] arr) {
        if (arr.length < 3)
            return -1;
        return arr.length;
    }
}
