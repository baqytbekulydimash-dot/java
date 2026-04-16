import java.util.Arrays;
import java.util.List;

public class Task9MethodReferenceExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Stream", "Lambda");

        words.forEach(System.out::println);
    }
}