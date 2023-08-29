package lectures.lect_2;

import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileReader test = null;
        try {
            test = new FileReader("test");
            Object a = test.read();
        } catch (RuntimeException | IOException e) {
            System.out.println("some exception" + e.getClass().getSimpleName());
        } finally {
            System.out.println("finally start");
            if (test != null)
                try {
                    test.close();
                } catch (IOException e) {
                    System.out.println("close exception");
                }
            System.out.println("finally end");
        }
    }
}
