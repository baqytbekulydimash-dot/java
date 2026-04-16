import java.util.function.BinaryOperator;

public class Task1AddTwoNumbers {
    public static void main(String[] args) {
        BinaryOperator<Integer> add = (a, b) -> a + b;

        System.out.println("Result: " + add.apply(5, 7));
    }
}