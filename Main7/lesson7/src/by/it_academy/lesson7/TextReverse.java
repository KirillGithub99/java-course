package by.it_academy.lesson7;

public class TextReverse {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FOREVER");
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        /*
        String text = "FOREVER";
        String[] arrayText = text.split("");
        int j = 0;
        while (j < arrayText.length-1){
        j++;
        }
        for (int i = j; i > 0; i--)
        {
            System.out.println(arrayText[i]);
        }
        */
    }

}
