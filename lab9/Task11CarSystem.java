public class Task11CarSystem {
    static class Car {
        class Engine {
            int power;

            Engine(int power) {
                this.power = power;
            }

            void showPower() {
                System.out.println("Engine power: " + power + " HP");
            }
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        Car.Engine engine = car.new Engine(250);
        engine.showPower();
    }
}