package homeworks.hw_final.exceptions;

public class ArraySizeException extends Throwable {
    public ArraySizeException(String[] result, int i) {
        super(result.length > i ? "Вы ввели больше данных, чем нужно." : "Вы ввели меньше данных, чем нужно.");
    }
}
