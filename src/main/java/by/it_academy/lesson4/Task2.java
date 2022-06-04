package by.it_academy.lesson4;

public class Task2 {

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
