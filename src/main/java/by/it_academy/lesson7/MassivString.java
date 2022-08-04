package by.it_academy.lesson7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MassivString {
    public static void main(String[] args) {
        String[] myData = new String[]{"Kirill,1999", "Sebastian,2001", "Maksim,1986"};
        Pattern namePattern = Pattern.compile("\\b\\w+\\b");
        Pattern yearPattern = namePattern.compile("\\d+");
        String longestName = "";
        double sum = 0;
        for (int i = 0; i < myData.length; i++) {
            Matcher nameMatcher = namePattern.matcher(myData[i]);
            nameMatcher.find();
            if (nameMatcher.group().length() > longestName.length()) {
                longestName = nameMatcher.group();
            }
            Matcher yearMatcher = yearPattern.matcher(myData[i]);
            yearMatcher.find();
            sum += Integer.parseInt(yearMatcher.group());
        }
        System.out.println(longestName);
        System.out.println(sum / myData.length);
    }
}
