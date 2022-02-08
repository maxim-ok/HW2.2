public class BonusRubles {
    public static void main(String[] args) {

        int initialAccount = 100; // Начальный счет
        int repleshAmount = 1200; // Сумма пополнения на счет
        int finalAccount; // Итоговый счет
        int bonusRubles; // Бонусы

        if (repleshAmount > 1000) {

            finalAccount = initialAccount + repleshAmount + (repleshAmount / 100);
            bonusRubles = repleshAmount / 100;

            System.out.println("Итоговый счет: " + finalAccount);
            System.out.println("Количество бонусных рублей: " + bonusRubles);
        } else {
            finalAccount = initialAccount + repleshAmount;

            System.out.println("Итоговый счет: " + finalAccount);
        }






    }
}
