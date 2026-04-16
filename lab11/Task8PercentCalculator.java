import java.util.Scanner;

public class Task8PercentCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number a: ");
        double a = sc.nextDouble();

        System.out.print("Enter percent b: ");
        double b = sc.nextDouble();

        double result = a * b / 100;

        System.out.println(b + "% of " + a + " = " + result);
    }
}