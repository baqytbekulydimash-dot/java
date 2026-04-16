import java.util.function.Function;

public class Task7CapitalizeFirstLetter {
    public static void main(String[] args) {
        Function<String, String> capitalize = s -> {
            if (s == null || s.isEmpty()) {
                return s;
            }
            return s.substring(0, 1).toUpperCase() + s.substring(1);
        };

        System.out.println(capitalize.apply("java"));
    }
}