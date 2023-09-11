package global.goit.edu.homework.task3;

import global.goit.edu.homework.FileContentChecker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class CheckerFrequencyOfWord implements FileContentChecker<String> {

    private ArrayList<String> words;


    public CheckerFrequencyOfWord(ArrayList<String> words) {
        this.words = words;
    }

    public void check() {

        LinkedHashMap<String, Integer> stringIntegerLinkedHashMap = new LinkedHashMap<>();

        for (String word : words) {
            int count = 0;
            for (int i = 0; i < words.size(); i++) {

                if (word.equals(words.get(i))) {
                    count++;
                }

            }

            stringIntegerLinkedHashMap.put(word, count);
        }

        stringIntegerLinkedHashMap.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);

    }

}
