public class Main {
    public static void main(String[] args) {

        int balance = 100; //начальный счёт
        int rechange = 1900; //сумма пополнения

        int newBalance = balance + rechange;
        int bonus = rechange / 100;
        int bonusBalance = newBalance + bonus;

        if (newBalance > 1000) {
            System.out.println(bonusBalance);
        } else {
            System.out.println(newBalance);
        }
    }
}