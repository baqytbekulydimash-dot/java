import java.util.function.Consumer;

public class Task11ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> printer = s -> System.out.println("Message: " + s);

        printer.accept("Hello Consumer");
    }
}