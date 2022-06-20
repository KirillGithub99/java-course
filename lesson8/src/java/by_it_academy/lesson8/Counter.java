package java.by_it_academy.lesson8;

public class Counter {
    int value;
    public Counter(int startValue){
        this.value = startValue;
    }
    public Counter(){
        this.value = 0;
    }
    public static void main(String[] args){
        Counter couter = new Counter(50);
        System.out.println(couter.value);
    }
}
