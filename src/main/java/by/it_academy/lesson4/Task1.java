package by.it_academy.lesson4;

public class Task1 {

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5};
        String result = "";
        for (int i = 0; i < a.length; i++) {
            result = result + a[i];
            if (i != a.length - 1) {
                result += ", ";
            }
        }
        System.out.println(result);
    }
}
