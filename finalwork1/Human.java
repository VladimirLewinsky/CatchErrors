package errors.finalwork1;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Human {
    static String family;
    static String name;
    static String surname;
    static String birthday;
    static String gender;

    public Human(String family, String name, String surname, String gender, String birthday) {
        this.family = family;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.gender = gender;
    }

    public static String getFamal() {
        System.out.println("Введите Фамилию");
        Scanner scannerfamily = new Scanner(System.in);
        String family1 = scannerfamily.nextLine();
        return family1;

    }

    public static String getName() {
        System.out.println("Введите Имя");
        Scanner scannername = new Scanner(System.in);
        String name1 = scannername.nextLine();
        return name1;
    }

    public static String getSurname() {
        System.out.println("Введите Отчество");
        Scanner scannersurname = new Scanner(System.in);
        String surname1 = scannersurname.nextLine();
        return surname1;

    }

    public static String getDate() {

        System.out.println("Введите Дату рождения");
        Scanner scannerdate = new Scanner(System.in);
        String hbdate = scannerdate.nextLine();
        // if (hbdate.length() != 10) {
        // System.out.println("Вы ввели неправельный формат");
        // getDate();
        // }
        return hbdate;
    }

    public static String getGender() {
        System.out.println("Введите пол");
        Scanner scannerGender = new Scanner(System.in);
        String a = scannerGender.nextLine();
        return a;

    }

    @Override
    public String toString() {

        return family + " " + name + " " + surname + " " + gender + " " + birthday;
    }

}