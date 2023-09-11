package global.goit.edu.homework;

import com.google.gson.Gson;
import global.goit.edu.homework.task1.CheckerPhoneNumbers;
import global.goit.edu.homework.task1.ReaderString;
import global.goit.edu.homework.task2.OutputUserToJson;
import global.goit.edu.homework.task2.ReaderUsers;
import global.goit.edu.homework.task2.User;
import global.goit.edu.homework.task3.CheckerFrequencyOfWord;
import global.goit.edu.homework.task3.ReaderWords;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

public class Module10Tests {

    public static void main(String[] args) {

        //Task 1

        File fileTask1 = new File("./FileTask1/file.txt");

        FileContentReader<String> task1Reader = new ReaderString();

        Collection<String> task1Collection = task1Reader.read(fileTask1);

        FileContentChecker<String> checkerPhoneNumbers = new CheckerPhoneNumbers(task1Collection);

        checkerPhoneNumbers.check();


        //Task2

        File fileTask2 = new File("./FileTask2/file.txt");

        ReaderUsers fileReaderUsers = new ReaderUsers();

        OutputUserToJson outputUserToJson = new OutputUserToJson();

        Collection<User> users = fileReaderUsers.read(fileTask2);

        Gson gson = outputUserToJson.userToJson(users);


        //Task3

        File fileTask3 = new File("./FileTask3/words.txt");

        FileContentReader<String> readerString = new ReaderWords();

        Collection<String> read = readerString.read(fileTask3);

        FileContentChecker<String> checker = new CheckerFrequencyOfWord((ArrayList<String>) read);

        checker.check();

    }

}
