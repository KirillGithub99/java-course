package by.it_academy.lesson7;

public class TextReverse {
    public static void main(String[] args) {
        String initial = "some string";
        StringBuilder builder = new StringBuilder();
        for (int i = initial.length() - 1; i >= 0; i--) {
            builder.append(initial.charAt(i));
        }
        System.out.println(builder);
    }

}
