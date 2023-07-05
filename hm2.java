package errors;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class hm2 {
    public static void main(String[] args) throws FileNotFoundException {
        // foo0(); - задание 1
        // foo1(); - задание 2


//  задание 3
        try {
            int a = 90;
            int b = 0;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
            // } catch (Throwable ex) {
            // System.out.println("Что-то пошло не так...");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }catch(ArithmeticException e){
            System.out.println("Деление на ноль");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

    // Реализуйте метод, который запрашивает у пользователя ввод дробного числа
    // (типа float), и возвращает введенное значение.
    // Ввод текста вместо числа не должно приводить к падению приложения, вместо
    // этого,
    // необходимо повторно запросить у пользователя ввод данных.
    public static void foo0() {
        try {
            System.out.println("Введите дробное число число");
            Scanner scanner = new Scanner(System.in);
            float number = scanner.nextFloat();
            System.out.println(number);
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не корректное значения");
            foo0();
        }

    }

    public static void foo1() {
        int[] intArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 9 };
        try {
            int d = 0;
            double catchedRes1 = intArray[5] / d;
            System.out.println("catchedRes1 = " + catchedRes1);

        } catch (NullPointerException e) {
            System.out.println("В массиве не должен содержаться null");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка, деление на ноль");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Вы вышли за пределы массива");
        }

    }
}
