package global.goit.edu.homework.task2;

import global.goit.edu.homework.FileContentReader;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class ReaderUsers implements FileContentReader <User> {

    public Collection<User> read(File file) {

        List<User> users = new ArrayList<>();

        try (Scanner scanner = new Scanner(file)) {

            while (scanner.hasNext()) {

                String text = scanner.nextLine();
                String[] user = text.split(" ");

                if (!user[0].equals("name") && !user[1].equals("age")) {
                    users.add(new User(user[0], Integer.parseInt(user[1])));
                }

            }

        } catch (IOException e) {
            System.err.print(e.getMessage());
        }
        return users;
    }
}
