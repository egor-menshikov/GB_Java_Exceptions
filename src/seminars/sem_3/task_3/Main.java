package seminars.sem_3.task_3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

//Создайте класс исключения, который будет выбрасываться при делении на 0. Исключение должно отображать
//        понятное для пользователя сообщение об ошибке.
//Создайте класс исключений, которое будет возникать при обращении к пустому элементу в массиве ссылочного типа.
//        Исключение должно отображать понятное для пользователя сообщение об ошибке
//Создайте класс исключения, которое будет возникать при попытке открыть несуществующий файл. Исключение должно
//        отображать понятное для пользователя сообщение об ошибке.
public class Main {
    public static void main(String[] args) {
//        String[] arr = new String[1];
//        arr[0] = null;
//        try {
//            System.out.println(arr[0].length());
//
//        } catch (NullPointerException e) {
//            throw new ArrNullPointerException();
//        }

//        try {
//            FileReader reader = new FileReader("asfasfas.sfd");
////            System.out.println(reader.read());
//        } catch (FileNotFoundException e) {
//            throw new MyFileNotFoundException();
//        }
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e){
            throw new ZeroDivException();
        }
        }
    }
