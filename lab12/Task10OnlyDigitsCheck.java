import java.util.Scanner;

public class Task10OnlyDigitsCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        if (text.matches("\\d+")) {
            System.out.println("The string contains only digits");
        } else {
            System.out.println("The string does not contain only digits");
        }
    }
}