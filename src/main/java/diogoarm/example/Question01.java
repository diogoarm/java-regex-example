package diogoarm.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by diogoam on 05/09/2015.
 */
public class Question01 {

    public static boolean startsWithUpperCaseAZ(String input) {
        Pattern pattern = Pattern.compile("^[A-Z]");
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }

}
