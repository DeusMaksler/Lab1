import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class lab1_2 {
    public static void main(String[] args) {
        Scanner scan2 = new Scanner(System.in);
        Calendar date2 = new GregorianCalendar();

        System.out.print("День: ");
        int season_day = scan2.nextInt();
        if (season_day < 1 || season_day > 31) {
            System.out.println("incorrect date");
            System.exit(-1);
        }

        System.out.print("Месяц: ");
        int season_month = scan2.nextInt();

        date2.set(2022, season_month - 1, 1);
        if (season_month < 1 || season_month > 12 || season_day > date2.getActualMaximum(Calendar.DAY_OF_MONTH) ) {
            System.out.println("incorrect date");
            System.exit(-1);
        }

        if (season_month >= 3 & season_month < 6) { System.out.println("Весна"); }
        else if (season_month >= 6 & season_month < 9) { System.out.println("Лето"); }
        else if (season_month >= 9 & season_month < 12) { System.out.println("Осень"); }
        else if (season_month < 3 || season_month == 12) { System.out.println("Зима");}
    }
}
