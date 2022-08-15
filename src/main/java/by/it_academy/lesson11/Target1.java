package by.it_academy.lesson11;

import java.util.ArrayList;

public class Target1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Burger");
        arrayList.add("1999");
        arrayList.add("Gomel03");
        arrayList.add("Ok");
        arrayList.add("BigBoss");
        for (String word : arrayList)
            try {
                System.out.println(Integer.parseInt(word));
            } catch (NumberFormatException e) {
                System.out.println(word + "is not number");
            }

    }
}

