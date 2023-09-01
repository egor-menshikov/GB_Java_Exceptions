package seminars.sem_3.task_3;

import java.io.FileNotFoundException;

public class MyFileNotFoundException extends FileNotFoundException {
    public MyFileNotFoundException() {
        super("Файл не существует");
    }

    public MyFileNotFoundException(String message) {
        super(message);
    }
}
