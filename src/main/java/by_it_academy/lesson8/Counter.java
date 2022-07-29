package by_it_academy.lesson8;

public class Counter {
    private int value;
    public Counter(int startValue){
        this.value = startValue;
    }
    public Counter(){
        this.value = 0;
    }
    public void increase(){
        value++;
    }
    public void decrease(){
        value--;
    }
    public void increase(int increaseBy){
        value += increaseBy;
    }
    public void decrease(int decreaseBy){
        value -= decreaseBy;
    }
    public static void main(String[] args){

    }
    class Runner {
        public static void main(String[] args) {
            Counter counter = new Counter(50);
            counter.decrease();
            System.out.println("After decreasing: " + counter);
            counter.increase();
            System.out.println("After increasing: " + counter);
            counter.increase(20);
            System.out.println("After increasingBy: " + counter);
            counter.decrease(30);
            System.out.println("After decreasingBy: " + counter);
        }
    }
}
