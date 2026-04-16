import java.util.Scanner;

public class Task9EngineeringCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 - sin");
        System.out.println("2 - cos");
        System.out.println("3 - tan");
        System.out.print("Choose function: ");
        int choice = sc.nextInt();

        System.out.print("Enter angle in radians: ");
        double x = sc.nextDouble();

        switch (choice) {
            case 1:
                System.out.println("sin(" + x + ") = " + Math.sin(x));
                break;
            case 2:
                System.out.println("cos(" + x + ") = " + Math.cos(x));
                break;
            case 3:
                System.out.println("tan(" + x + ") = " + Math.tan(x));
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}