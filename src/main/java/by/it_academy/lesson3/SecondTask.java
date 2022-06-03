package by.it_academy.lesson3;

public class SecondTask {
    public static void main(String[] args) {
        char grade = 'd';
        switch (grade) {
            case 'a':
                System.out.println("Distinction");
                break;
            case 'b':
            case 'c':
                System.out.println("First class");
                break;
            case 'd':
                System.out.println("You have passed");
                break;
            case 'f':
                System.out.println("FAIL. TRY AGAIN PLS");
                break;
            default:
                System.out.println("Invalid grade");
        }
    }
}

