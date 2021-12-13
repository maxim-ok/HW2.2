public class BonusRubles {
    public static void main(String[] args) {

        int initialAccount = 100; // Начальный счет
        int repleshAmount = 1200; // Сумма пополнения
        int finalAccount; // Итоговый счет
        int bonusRubles; // Бонусы

        if (repleshAmount >= 1000) {

            finalAccount = initialAccount + repleshAmount + (repleshAmount / 100);
            bonusRubles = repleshAmount / 100;

            System.out.println("Итоговый счет: " + finalAccount);
            System.out.println("Количество бонусных рублей: " + bonusRubles);
        } else {
            finalAccount = initialAccount + repleshAmount;

            System.out.println("Итоговый счет: " + finalAccount);
        }





        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}
