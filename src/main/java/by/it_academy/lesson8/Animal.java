package by.it_academy.lesson8;

public class Animal {


    String name;

    public Animal(String name) { //конструктор
        this.name = name;
    }

    public Animal() {
    }

    public String name() {// вернули имя.
        return name;
    }

    public void eat() {
        System.out.println(name() + "eat");//x+eat
    }

    public void sleep() {
        System.out.println(name() + "sleep");//X+sleep
    }
    public void wakeUp(){
        System.out.println(name + "wakeUp");
    }

}
