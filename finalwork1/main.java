package errors.finalwork1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.Date;
import java.text.Format;
import java.util.ArrayList;
import java.util.Scanner;
import errors.finalwork1.Human;
import errors.finalwork1.DateLengthException;

public class main {
    public static ArrayList<String> array = new ArrayList();

    public static void main(String[] args) throws Exception, DateLengthException {

        Human g = new Human(Human.getFamal(), Human.getName(), Human.getSurname(), Human.getGender(), Human.getDate());
        try {
            writeFile(humantoString(g));
        } catch (DateLengthException e) {
            System.out.println(e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка с файлом");
        } catch (IOException e) {
            System.out.println("Ошибка записи");
        } catch (RuntimeException e) {
            System.out.println("Ошибка с данным");
        } catch (GendException e){
            System.out.println(e.getMessage());
        }

    }

    public static ArrayList<String> humantoString(Human name) throws DateLengthException, GendException {
        if (Human.birthday.length() < 10) {
            throw new DateLengthException();
        }
        if (!(Human.gender.equals("M") || Human.gender.equals("F"))) {
            throw new GendException();
        }
         {
            throw new GendException();
        }
        ArrayList<String> array = new ArrayList();
        array.add(Human.family);
        array.add(Human.name);
        array.add(Human.surname);
        array.add(Human.birthday);
        array.add(Human.gender);
        return array;
    }

    public static void writeFile(ArrayList<String> array) throws IOException {
        String path = String.format("%s.txt", array.get(0));
        File file = new File(path);
        String text = "";

        for (int i = 0; i < array.size(); i++) {
            text += array.get(i) + " ";
        }
        FileWriter writer = new FileWriter(file, true);
        BufferedWriter bufferWriter = new BufferedWriter(writer);
        bufferWriter.write(text);
        bufferWriter.write("\n");
        bufferWriter.close();
        System.out.println("Данные записаны в файл.");
    }

}
