package Advanced.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("we", Pattern.CASE_INSENSITIVE); //
        Matcher matcher = pattern.matcher("we cant get out the car"); 

        boolean find = matcher.find();

        if (find) {
            System.out.println("found");
        } else {
            System.out.println("nooo");
        }
    }
}
