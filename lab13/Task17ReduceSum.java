import java.util.Arrays;
import java.util.List;

public class Task17ReduceSum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20);

        int sum = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println("Sum: " + sum);
    }
}