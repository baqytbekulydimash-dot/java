import java.util.Scanner;

public class Task10ExpressionCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter expression (example: 2 + 3 * 4): ");
        double a = sc.nextDouble();
        char op1 = sc.next().charAt(0);
        double b = sc.nextDouble();
        char op2 = sc.next().charAt(0);
        double c = sc.nextDouble();

        double result;

        if ((op2 == '*' || op2 == '/')) {
            double temp = 0;

            if (op2 == '*') {
                temp = b * c;
            } else {
                if (c == 0) {
                    System.out.println("Cannot divide by zero");
                    return;
                }
                temp = b / c;
            }

            if (op1 == '+') {
                result = a + temp;
            } else if (op1 == '-') {
                result = a - temp;
            } else if (op1 == '*') {
                result = a * temp;
            } else if (op1 == '/') {
                if (temp == 0) {
                    System.out.println("Cannot divide by zero");
                    return;
                }
                result = a / temp;
            } else {
                System.out.println("Invalid operator");
                return;
            }
        } else {
            double temp = 0;

            if (op1 == '+') {
                temp = a + b;
            } else if (op1 == '-') {
                temp = a - b;
            } else if (op1 == '*') {
                temp = a * b;
            } else if (op1 == '/') {
                if (b == 0) {
                    System.out.println("Cannot divide by zero");
                    return;
                }
                temp = a / b;
            } else {
                System.out.println("Invalid operator");
                return;
            }

            if (op2 == '+') {
                result = temp + c;
            } else if (op2 == '-') {
                result = temp - c;
            } else {
                System.out.println("Invalid operator");
                return;
            }
        }

        System.out.println("Result: " + result);
    }
}