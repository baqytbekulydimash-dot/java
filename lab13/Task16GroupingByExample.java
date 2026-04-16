import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task16GroupingByExample {
    static class Student {
        String name;
        int age;

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", 20),
                new Student("Bob", 20),
                new Student("Charlie", 21),
                new Student("Diana", 21)
        );

        Map<Integer, List<Student>> grouped = students.stream()
                .collect(Collectors.groupingBy(s -> s.age));

        System.out.println(grouped);
    }
}