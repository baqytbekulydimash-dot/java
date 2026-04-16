import java.util.ArrayList;
import java.util.Scanner;

public class Task6CalculationHistory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> history = new ArrayList<>();

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        double result = 0;
        boolean valid = true;

        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Cannot divide by zero");
                    valid = false;
                } else {
                    result = a / b;
                }
                break;
            default:
                System.out.println("Invalid operator");
                valid = false;
        }

        if (valid) {
            String record = a + " " + op + " " + b + " = " + result;
            history.add(record);

            System.out.println("Result: " + result);
            System.out.println("History:");
            for (String item : history) {
                System.out.println(item);
            }
        }
    }
}