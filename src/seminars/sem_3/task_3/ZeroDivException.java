package seminars.sem_3.task_3;

public class ZeroDivException extends ArithmeticException{
    public ZeroDivException(String message) {
        super(message);
    }
    public ZeroDivException() {
        super("Нельзя делить на 0");
    }
}
