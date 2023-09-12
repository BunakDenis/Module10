package global.goit.edu.homework.task1;

import global.goit.edu.homework.FileContentReader;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class ReaderString implements FileContentReader<String> {

    public Collection<String> read(File file) {

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
}