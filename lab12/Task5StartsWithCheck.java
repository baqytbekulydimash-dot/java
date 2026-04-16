import java.util.Scanner;

public class Task5StartsWithCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        if (text.startsWith(word)) {
            System.out.println("The string starts with \"" + word + "\"");
        } else {
            System.out.println("The string does not start with \"" + word + "\"");
        }
    }
}