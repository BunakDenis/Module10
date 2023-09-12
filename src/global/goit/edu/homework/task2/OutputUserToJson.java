package global.goit.edu.homework.task2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;

public class OutputUserToJson {

    public Gson userToJson(Collection<User> users) {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter("./FileTask2/User.json")) {

            writer.write(gson.toJson(users));
            writer.flush();

        } catch (IOException e) {
            System.err.print(e.getMessage());
        }
        return gson;
    }
}