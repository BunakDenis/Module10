package global.goit.edu.homework.task1;

import global.goit.edu.homework.FileContentReader;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class ReaderString implements FileContentReader<String> {

    public Collection <String> read(File file) {

        Collection<String> result = new ArrayList<>();

        try (Scanner scanner = new Scanner(file)) {

            while (scanner.hasNext()) {
                String value = scanner.nextLine();
                result.add(value);
            }
        } catch (IOException e) {
            System.err.print(e.getMessage());
        }
        return result;
    }

    /*
    Дано текстовий файл file.txt, в якому є список номерів телефонів (один рядок - один телефон).

    Необхідно написати метод, який буде читати файл, і виводити в консоль всі валідні номери телефонів.

    Телефон вважається валідним, якщо він відповідає одному з двох форматів (x - це одна цифра):

    (xxx) xxx-xxxx
    xxx-xxx-xxxx

     */



}
