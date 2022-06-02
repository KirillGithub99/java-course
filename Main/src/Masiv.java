
public class Masiv {
    public static void main(String[] args) {
        int[] a = new int[] {1, 2, 3, 4, 5};
        print(a);
        printToStars(a);
        System.out.println(arraySum(a));
    }
    public static  void print(int[] a) {   // почему не выводит в строчку????
        for (int i = 0; i < a.length; i++) {
            for (int j = 0 ; j < a[i]; j++){
                System.out.println(a[j] + ",");
            }
        }
    }
    public static void printToStars(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i]; j++)
                System.out.print("*");
            System.out.println("");
        }
    }
    public static int arraySum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}
