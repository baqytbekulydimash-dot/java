import java.util.Random;
import java.util.function.Supplier;

public class Task12SupplierExample {
    public static void main(String[] args) {
        Supplier<Integer> randomNumber = () -> new Random().nextInt(100);

        System.out.println("Random number: " + randomNumber.get());
    }
}