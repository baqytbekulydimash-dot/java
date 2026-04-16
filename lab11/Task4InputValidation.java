import java.util.InputMismatchException;
import java.util.Scanner;

public class Task4InputValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            double a = sc.nextDouble();

            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            System.out.println("Sum: " + (a + b));
        } catch (InputMismatchException e) {
            System.out.println("Error: please enter only numbers");
        }
    }
}