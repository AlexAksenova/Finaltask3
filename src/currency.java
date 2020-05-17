import java.util.Scanner;

public class currency {
            public static void main (String[] args)
            {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите сумму в RUB = ");
            float sum = scanner.nextFloat();
            System.out.print("Введите курс обмена RUB/USD = ");
            float course = scanner.nextFloat();
            float finalSum = sum/course;;
            System.out.printf("Итоговая сумма в USD = %.2f", finalSum );
            }
}

