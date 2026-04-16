import java.util.Scanner;

public class Task9ReplaceVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String result = text.replaceAll("(?i)[aeiouәіөүұыэюяё]", "*");

        System.out.println("Result: " + result);
    }
}