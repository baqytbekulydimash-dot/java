import java.util.Scanner;

public class Task4CountCharsWithoutSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        int count = text.replace(" ", "").length();

        System.out.println("Characters without spaces: " + count);
    }
}