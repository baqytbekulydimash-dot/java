import java.util.Scanner;

public class Task2SqrtCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        double number = sc.nextDouble();

        if (number < 0) {
            System.out.println("Square root of negative number is not allowed");
        } else {
            System.out.println("Result: " + Math.sqrt(number));
        }
    }
}