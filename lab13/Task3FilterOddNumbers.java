import java.util.Arrays;
import java.util.List;

public class Task3FilterOddNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        numbers.stream()
                .filter(n -> n % 2 != 0)
                .forEach(System.out::println);
    }
}