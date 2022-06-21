package by.it_academy.lesson3;

public class FirstTask {

    public static void main(String[] args) {
        int giftValue = 6000;

        int minPriceTax = 0;
        double percentOfTax = 0.0;
        if (giftValue >= 5000 && giftValue <= 25000) {
            minPriceTax = 100;
            percentOfTax = 0.08;
        } else if (giftValue > 25000) {
            minPriceTax = 1700;
            percentOfTax = 0.1;
        }
        double result = minPriceTax + (giftValue - 5000) * percentOfTax;

        System.out.println(result);
    }
}


