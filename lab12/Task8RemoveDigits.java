import java.util.Scanner;

public class Task8RemoveDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String result = text.replaceAll("[0-9]", "");

        System.out.println("Result: " + result);
    }
}