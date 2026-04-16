import java.util.Arrays;
import java.util.List;

public class Task18DistinctLimit {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 4, 5, 5, 6);

        numbers.stream()
                .distinct()
                .limit(4)
                .forEach(System.out::println);
    }
}