package java.by_it_academy.lesson8;

public class Cat extends Animal implements NoiseCapable {

    public Cat(String name) {
        super(name);
    }
    public Cat(){

    }
    public void purr(){
        System.out.println(name() + "purr");
    }

    @Override
    public void makeNoise() {
        purr();
    }
    public static void main(String[] args){
        Cat cat = new Cat();
        cat.name = "Jora";
        cat.sleep();
        cat.eat();
        cat.makeNoise();
    }
}
