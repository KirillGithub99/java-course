package by.it_academy.lesson7;

public class Checker {
    boolean timeOfDay(String text) {
        return text.matches("([0-1]\\d|2[0-3]):[0-5]\\d:[0-5]\\d");
    }

    public static void main(String[] args) {
        Checker checker = new Checker();
        System.out.println(checker.timeOfDay("00:00:00"));
        System.out.println(checker.timeOfDay("23:59:59"));
        System.out.println(checker.timeOfDay("24:59:59"));
        System.out.println(checker.timeOfDay("23:60:59"));
    }

}




