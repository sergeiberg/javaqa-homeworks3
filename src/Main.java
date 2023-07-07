public class Main {
    public static void main(String[] args) {

        int balance = 100; //начальный счёт
        int rechange = 1900; //сумма пополнения

        int newbalance = balance + rechange;
        int bonus = rechange / 100;
        int bonusbalance = newbalance + bonus;

        if (newbalance > 1000) {
            System.out.println(bonusbalance);
        } else {
            System.out.println(newbalance);
        }
    }
}