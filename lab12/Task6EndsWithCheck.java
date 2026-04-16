import java.util.Scanner;

public class Task6EndsWithCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        System.out.print("Enter an ending: ");
        String ending = sc.nextLine();

        if (text.endsWith(ending)) {
            System.out.println("The string ends with \"" + ending + "\"");
        } else {
            System.out.println("The string does not end with \"" + ending + "\"");
        }
    }
}