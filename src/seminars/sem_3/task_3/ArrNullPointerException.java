package seminars.sem_3.task_3;

public class ArrNullPointerException extends NullPointerException{
    public ArrNullPointerException() {
        super("Обращение к пустому элементу");
    }

    public ArrNullPointerException(String message) {
        super(message);
    }
}
