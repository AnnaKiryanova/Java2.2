public class Main {
    public static void main(String[] args) {

        int balance = 300;
        int addition = 3500;

        int bonus;

        if (addition > 1000) {
            bonus = addition / 100;
        } else
            bonus = 0;

        int totalBalance;
        totalBalance = balance + addition + bonus;
        System.out.println("Колличество бонусных рублей " + bonus);
        System.out.println("Итоговый счет " + totalBalance);
    }
}