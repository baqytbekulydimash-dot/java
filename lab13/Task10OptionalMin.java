import java.util.Arrays;
import java.util.List;

public class Task10OptionalMin {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(8, 3, 15, 1, 9);

        int min = numbers.stream()
                .min(Integer::compare)
                .orElse(0);

        System.out.println("Min: " + min);
    }
}