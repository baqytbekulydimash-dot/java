import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task14StudentFilterSort {
    static class Student {
        String name;
        int age;
        double grade;

        Student(String name, int age, double grade) {
            this.name = name;
            this.age = age;
            this.grade = grade;
        }

        public String toString() {
            return name + " " + age + " " + grade;
        }
    }

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", 20, 85),
                new Student("Bob", 21, 75),
                new Student("Charlie", 19, 92),
                new Student("Diana", 22, 80)
        );

        students.stream()
                .filter(s -> s.grade > 80)
                .sorted(Comparator.comparing(s -> s.name))
                .forEach(System.out::println);
    }
}