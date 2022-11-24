import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class lab1_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Calendar date = new GregorianCalendar();
        int current_day = date.get(Calendar.DAY_OF_MONTH);
        int current_month = date.get(Calendar.MONTH) + 1;
        int current_year = date.get(Calendar.YEAR);

        System.out.print("День рождения: ");
        int b_day = scan.nextInt();
        if (b_day < 1 || b_day > 31) {
            System.out.println("incorrect date");
            System.exit(-1);
        }

        System.out.print("Месяц рождения: ");
        int b_month = scan.nextInt();

        date.set(2022, b_month - 1, 2);
        if (b_month < 1 || b_month > 12 || b_day > date.getActualMaximum(Calendar.DAY_OF_MONTH) ) {
            System.out.println("incorrect date");
            System.exit(-1);
        }

        System.out.print("Год рождения: ");
        int b_year = scan.nextInt();
        if (b_year < 1 || b_year > 2022) {
            System.out.println("incorrect date");
            System.exit(-1);
        }

        if (current_day < b_day) {
            current_month -= 1;
            date.set(2022, current_month - 1, 2);
            current_day += date.getActualMaximum(Calendar.DAY_OF_MONTH);
        }

        if (current_month < b_month) {
            current_year -= 1;
            current_month += 12;
        }

        System.out.printf(" %d лет, %d месяцев, %d дней", (current_year - b_year), (current_month - b_month), (current_day - b_day));
        scan.close();
    }
}