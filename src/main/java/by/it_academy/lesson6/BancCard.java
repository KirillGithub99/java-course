package by.it_academy.lesson6;

public class BancCard {
    private double balance;

    public BancCard(double balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {
        BancCard alphabank = new BancCard(1);
        alphabank.eatAfforbably();
        System.out.println(alphabank);
        alphabank.addMoney(1000);
        System.out.println(alphabank);
        alphabank.eatHertily();
        System.out.println(alphabank);
    }

    @Override
    public String toString() {
        return "Баланс карты" + balance + "BYN";
    }


    private void eatHertily() {
        if (this.balance  >= 4.6) {
            this.balance -= 4.6;
        }
    }

    private void eatAfforbably() {
        if (this.balance >= 2.6) {
            this.balance -= 2.6;
        }
    }

    private void addMoney(double amount) {
        if (amount < 0){
            return;
        }
            this.balance = balance + amount;
    }
}

