import java.io.IOException;

public class SecondTask {
    public static void main(String[] args) throws IOException {
        char x = (char) System.in.read();
        char grade = x;
        switch (grade) {
            case 'a':
                System.out.println("Distinction");
                break;
            case 'b':
                System.out.println("First class");
                break;
            case 'c':
                System.out.println("First class");
                break;
            case 'D':
                System.out.println("You have passed");
                break;
            case 'F':
                System.out.println("FAIL. TRY AGAIN PLS");
                break;
            default:
                System.out.println("Invalid grade");

        }
    }
}

