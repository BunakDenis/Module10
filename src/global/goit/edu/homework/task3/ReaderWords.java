package global.goit.edu.homework.task3;

import global.goit.edu.homework.FileContentReader;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class ReaderWords implements FileContentReader<String> {
    @Override
    public Collection <String> read(File file) {
        Collection<String> result = new ArrayList<>();

        try (Scanner scanner = new Scanner(file)) {

            while (scanner.hasNext()) {
                String value = scanner.nextLine();
                String[] word = value.split(" ");

                result.addAll(Arrays.asList(word));

            }
        } catch (IOException e) {
            System.err.print(e.getMessage());
        }
        return result;
    }
}
