public class Main {
    public static void main(String[] args) {
        int account = 100; // начальный счёт
        int deposit = 1100; // счёт пополнения
        int bonus; // бонус

        if (deposit > 1000) {
            bonus = deposit / 100;
        } else {
            bonus = 0;
        }
        int totalAccount = account + deposit + bonus;
        System.out.println("Итоговая сумма в счёте " + totalAccount + "₽"  + " из них бонус составляет " + bonus + "₽");
    }
}