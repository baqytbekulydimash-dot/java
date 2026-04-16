public class Task3MathUtils {
    static class MathUtils {
        static int square(int n) {
            return n * n;
        }

        static int cube(int n) {
            return n * n * n;
        }
    }

    public static void main(String[] args) {
        int number = 4;

        System.out.println("Square of " + number + " = " + MathUtils.square(number));
        System.out.println("Cube of " + number + " = " + MathUtils.cube(number));
    }
}