package global.goit.edu.homework.task1;

import global.goit.edu.homework.FileContentChecker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckerPhoneNumbers implements FileContentChecker<String> {

    private Collection<String> PhoneNumbers;
    private Collection<String> validPhoneNumbers;

    public CheckerPhoneNumbers (Collection<String> PhoneNumbers) {
        this.PhoneNumbers = PhoneNumbers;
    }

    @Override
    public void check () {

        Collection <String> result = new ArrayList<>();

        for (String phoneNumber : PhoneNumbers) {
            //System.out.println(phoneNumber);
            if (checkForValidPhoneNumber(phoneNumber)) {
                System.out.println(phoneNumber);
                result.add(phoneNumber);
            }
        }
        validPhoneNumbers = result;
    }

    private boolean checkForValidPhoneNumber(String phoneNumber) {

        Pattern patternFirst = Pattern.compile("^\\(\\d{3}\\)\\s\\d{3}\\-\\d{4}");
        Pattern patternSecond = Pattern.compile("^\\d{3}\\-\\d{3}\\-\\d{4}");

        Matcher matcherFirst = patternFirst.matcher(phoneNumber);
        boolean matchFirstFound = matcherFirst.find();

        Matcher matcherSecond = patternSecond.matcher(phoneNumber);
        boolean matchSecondFound = matcherSecond.find();

        if (matchFirstFound || matchSecondFound) {
            return true;
        } else {
            return false;
        }
    }
}
