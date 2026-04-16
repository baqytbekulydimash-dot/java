import java.util.Scanner;

public class Task2RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String result = text.replace(" ", "");

        System.out.println("Result: " + result);
    }
}