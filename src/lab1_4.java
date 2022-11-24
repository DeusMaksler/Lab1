import java.util.Scanner;

public class lab1_4 {
    public static void main(String[] args) {
        Scanner scan4 = new Scanner(System.in);
        long base;

        System.out.print("x: ");
        int x = scan4.nextInt();

        System.out.print("n: ");
        int n = scan4.nextInt();
        if (n < -15 || n > 15) {
            System.out.println("допустимое значение: -15<n<15");
            System.exit(-1);
        }

        if (n == 0) {
            System.out.println(1);
            System.exit(0);
        }

       base = x;
       for (int i = 1; i < Math.abs(n); i++){ base = base * x; }

        if (n < 0){ System.out.println(1.0 / base); }
        else { System.out.println(base); }
    }
}
