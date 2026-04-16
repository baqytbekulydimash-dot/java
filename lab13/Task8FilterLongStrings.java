import java.util.Arrays;
import java.util.List;

public class Task8FilterLongStrings {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "hi", "stream", "cat", "lambda", "sun");

        words.stream()
                .filter(s -> s.length() > 5)
                .forEach(System.out::println);
    }
}