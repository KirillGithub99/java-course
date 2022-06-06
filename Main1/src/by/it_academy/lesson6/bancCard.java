package by.it_academy.lesson6;

public class bancCard {
    double balance;
    public bancCard(double balance){
        this.balance = balance;
    }
    public static void main(String[] args){
        bancCard alphabank = new bancCard(1);
        alphabank.eatAfforbably();
        System.out.println(alphabank.toString());
        alphabank.addMoney(1000);
        System.out.println(alphabank.toString());
        alphabank.eatHertily();
        System.out.println(alphabank.toString());
    }
    public String toString(){
        return "Баланс карты" + balance + "BYN";
    }


    private void eatHertily() {
        if (this.balance - 2.6 > 0 ){
            this.balance -= 2.6;
        }
    }

    private void eatAfforbably() {
        if (this.balance - 4.5 >0){
            this.balance -= 4.5;
        }
    }

    private double addMoney(double amount) {
        if (amount < 0 )
            return balance;
        else {
            this.balance = balance + amount;
        }
        return balance;
        }
    }

