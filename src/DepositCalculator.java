import java.util.Scanner;

public class DepositCalculator {
    double calculateComplexPercent(double amount, double yearRate, int period ) {
       double pay = amount * Math.pow((1 + yearRate/ 12), 12 * period);
       return randomValue(pay, 2);
    }

    double calculateSimplePercent(double doubleAmount, double double_year_rate, int deposit_period) {
         return randomValue(doubleAmount + doubleAmount * double_year_rate * deposit_period, 2);
    }

    double randomValue(double value, int places) {
       double ScaLe= Math.pow(10, places);
       return Math.round(value*ScaLe)/ScaLe;
    }

    void calculateDepositAmount()    {
        int period;
        int action;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сумму вклада в рублях:");
        int amount = scanner.nextInt();

        System.out.println("Введите срок вклада в годах:");
        period = scanner.nextInt();

        System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");
        action = scanner.nextInt();

        double percent = 0;

        if (action == 1) {
            percent = calculateSimplePercent(amount, 0.06, period);
        } else if (action == 2) {
            percent = calculateComplexPercent(amount, 0.06, period);
        }

        System.out.println("Результат вклада: " + amount + " за " + period + " лет превратятся в " + percent);
    }
    public static void main(String[] args) {
        new DepositCalculator().calculateDepositAmount();
    }
}
