public class Task7OuterInner {
    static class Outer {
        class Inner {
            void showMessage() {
                System.out.println("Hello from Inner class");
            }
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.showMessage();
    }
}