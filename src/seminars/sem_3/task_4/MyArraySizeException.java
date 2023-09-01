package seminars.sem_3.task_4;

public class MyArraySizeException extends RuntimeException{
    public MyArraySizeException() {
        super("Массив размера не 4х4");
    }
}
