public class Task7ClearScreen {
    public static void clearScreen() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Before clearing screen");
        clearScreen();
        System.out.println("After clearing screen");
    }
}