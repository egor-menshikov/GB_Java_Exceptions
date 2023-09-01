package seminars.sem_3.task_2;


//Создайте класс Счетчик, у которого есть метод add(), увеличивающий значение
//внутренней int переменной на 1. Сделайте так, чтобы с объектом такого типа
//можно было работать в блоке try-with-resources. Подумайте, что должно происходить
//при закрытии этого ресурса? Напишите метод для проверки, закрыт ли ресурс.
//При попытке вызвать add() у закрытого ресурса, должен выброситься IOException


import java.io.IOException;

public class Main implements AutoCloseable {
    private static Integer count;

    public Main() {
        count = 0;
    }

    public static void increment() throws IOException {
        if (getCount() != null)
            count++;
        else
            throw new IOException();
    }

    @Override
    public void close() throws Exception {
        count = null;
    }

    public static Integer getCount() throws RuntimeException{
        if (count != null)
            return count;
        else {
            throw new NullPointerException();
        }
    }
}
