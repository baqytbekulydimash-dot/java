import java.util.Scanner;

public class Task1PowerCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        double x = sc.nextDouble();

        System.out.print("Enter y: ");
        double y = sc.nextDouble();

        double result = Math.pow(x, y);

        System.out.println("Result: " + result);
    }
}