import java.util.Arrays;
import java.util.List;

public class Task5FindMaxElement {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 25, 7, 99, 43);

        int max = numbers.stream()
                .max(Integer::compare)
                .orElse(0);

        System.out.println("Max: " + max);
    }
}