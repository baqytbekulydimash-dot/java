import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task6SortStringsByLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "kiwi", "banana", "fig", "orange");

        List<String> sorted = words.stream()
                .sorted((a, b) -> Integer.compare(a.length(), b.length()))
                .collect(Collectors.toList());

        System.out.println(sorted);
    }
}