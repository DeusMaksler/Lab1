import java.util.Scanner;

public class lab1_3 {
    public static void main(String[] args) {
        Scanner scan3 = new Scanner(System.in);
        double X, Y;
        int count = 0;

        System.out.print("Количество точек: ");
        int points = scan3.nextInt();
        if (points < 1) {
            System.out.println("недостаточно точек");
            System.exit(-1);
        }

        System.out.print("Радиус окружности: ");
        double rad = scan3.nextDouble();
        if (rad < 1) {
            System.out.println("некорректный радиус");
            System.exit(-1);
        }

        for (int i=1; i <= points; i++) {
            System.out.printf("X %d точки: ", i);
            X = scan3.nextDouble();
            System.out.printf("Y %d точки: ", i);
            Y= scan3.nextDouble();

            if ((X*X + Y*Y) <= rad*rad) { count += 1;}
        }

        System.out.printf("%d точек попало в окружность", count);
    }
}
