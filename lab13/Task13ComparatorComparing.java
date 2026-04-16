import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task13ComparatorComparing {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Zharas", "Ali", "Dana", "Murat");

        List<String> sorted = names.stream()
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toList());

        System.out.println(sorted);
    }
}