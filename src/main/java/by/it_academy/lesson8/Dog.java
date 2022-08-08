package by.it_academy.lesson8;

public class Dog extends Animal implements NoiseCapable {

    public Dog(String name) {
        super(name);
    }

    public Dog() {
        super("Dog");
    }

    public void barks() {
        System.out.println(name() + "barks");
    }

    @Override
    public void makeNoise() {
        barks();
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Muha");
        dog.makeNoise();
        dog.sleep();
        dog.eat();
    }


}


