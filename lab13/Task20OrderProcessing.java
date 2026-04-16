import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task20OrderProcessing {
    static class Order {
        String productName;
        String category;
        double price;

        Order(String productName, String category, double price) {
            this.productName = productName;
            this.category = category;
            this.price = price;
        }

        public String toString() {
            return productName + " - " + price;
        }
    }

    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order("Laptop", "Electronics", 350000),
                new Order("Phone", "Electronics", 200000),
                new Order("Bread", "Food", 500),
                new Order("Milk", "Food", 700),
                new Order("Headphones", "Electronics", 15000)
        );

        System.out.println("Orders with price > 10000:");
        orders.stream()
                .filter(o -> o.price > 10000)
                .forEach(System.out::println);

        System.out.println();

        System.out.println("Sorted by price:");
        orders.stream()
                .sorted((a, b) -> Double.compare(a.price, b.price))
                .forEach(System.out::println);

        System.out.println();

        System.out.println("Grouped by category:");
        Map<String, List<Order>> grouped = orders.stream()
                .collect(Collectors.groupingBy(o -> o.category));
        System.out.println(grouped);

        System.out.println();

        double total = orders.stream()
                .map(o -> o.price)
                .reduce(0.0, Double::sum);

        System.out.println("Total price: " + total);
    }
}