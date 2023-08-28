package lectures.lect_1;

import java.io.File;

public class Main {
    public static void main(String[] args) {
//        System.out.println(getFileSize(new File("C:\\Users\\r3bor\\OneDrive\\Desktop\\family_ree.txt")));
        System.out.println(divide(10,0));
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new RuntimeException("Нельзя делить на 0");
        }
        return a/b;
    }

    public static long getFileSize(File file) {
        if (!file.exists()) return -1L;
        return file.length();
    }
}
