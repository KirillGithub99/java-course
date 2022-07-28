package by.it_academy.lesson7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MassivString {
    public static void main(String[] args){
        String[] myData = new String[]{"Kirill,1999","Sebastian,2001"};
        Pattern pattern = Pattern.compile("\\b\\w+\\b");
        Pattern pattern1 = pattern.compile("\\d+");
        String text = "";
        double aferageDuring = 0;
        int j = 0;
        for (int i = 0; i < myData.length; i++){
            Matcher matcher = pattern.matcher(myData[i]);
            matcher.find();
            if (matcher.group().length() > text.length()){
                text = matcher.group();
            }
            Matcher matcher1 = pattern.matcher(myData[i]);
            matcher.find();
            matcher.group();
            aferageDuring += Integer.parseInt(matcher.group());
            j++;
        }
        System.out.println(text);
        System.out.println(aferageDuring / j);
    }
}
