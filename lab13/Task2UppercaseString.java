import java.util.function.Function;

public class Task2UppercaseString {
    public static void main(String[] args) {
        Function<String, String> toUpper = s -> s.toUpperCase();

        System.out.println(toUpper.apply("hello java"));
    }
}