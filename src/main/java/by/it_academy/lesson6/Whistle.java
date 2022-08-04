package by.it_academy.lesson6;

public class Whistle {
    static String sound;
    public Whistle(String whistleSound) {
        sound = whistleSound;
    }
    public static void main(String[] args) {
        Whistle whistle = new Whistle("sheeeeesh");
        whistle.sound();
    }
        void sound() {
        System.out.println(sound);
    }
    }



