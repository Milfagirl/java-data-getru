public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int conditionForBonus = 100;
        int bonus = 0;
        int payment = 1000;
        if (payment >= 1000) bonus = payment / conditionForBonus;
        balance = balance + payment + bonus;
        System.out.println("Бонус: " + bonus);
        System.out.println("Баланс: " + balance);
    }
}
