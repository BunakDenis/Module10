package global.goit.edu.homework.task1;

import global.goit.edu.homework.FileContentChecker;

import java.util.ArrayList;
import java.util.Collection;

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
            if (checkForValidPhoneNumber(phoneNumber)) {
                System.out.println(phoneNumber);
                result.add(phoneNumber);
            }
        }
        validPhoneNumbers = result;
    }

    private boolean checkForValidPhoneNumber(String phoneNumber) {

        int concurrence = 0;
        int concurrence1 = 0;

        //проверяем соответствует номер шаблону (xxx) xxx-xxxx
        if (phoneNumber.charAt(0) == '(') {
            concurrence++;
        }

        if (phoneNumber.charAt(4) == ')') {
            concurrence++;
        }

        if (phoneNumber.charAt(5) == ' ') {
            concurrence++;
        }

        if (phoneNumber.charAt(9) == '-') {
            concurrence++;
        }

        //проверяем соответствует номер шаблону xxx-xxx-xxxx

        if (phoneNumber.charAt(3) == '-' && phoneNumber.charAt(7) == '-') {
            concurrence1++;
        }

        if (concurrence == 4 || concurrence1 == 1) {
            return true;
        } else {
            return false;
        }
    }
}
