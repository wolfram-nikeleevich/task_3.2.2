public class Main {
    public static void main(String[] args) {
        int initialBalance = 100;
        int incomingSum = 1000;
        int bonus = (incomingSum >= 1000) ? (incomingSum / 100) : 0;
        int finalBalance = initialBalance + incomingSum + bonus;
        System.out.println("Ваш итоговый счет составляет " + finalBalance);
        if (bonus > 0) {
            System.out.println("Ваш бонус составляет " + bonus + " рублей");
        }
    }
}
