package java.by_it_academy.lesson8;

public class Dog extends Animal implements NoiseCapable {

    public Dog() {
        super(name);
    }



    public void barks() {
        System.out.println(name() + "barks");
    }

    @Override
    public void makeNoise() {
        barks();
    }
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.name = "Muha";
        dog.makeNoise();
        dog.sleep();
        dog.eat();
    }
}

