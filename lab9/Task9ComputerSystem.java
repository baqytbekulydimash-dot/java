public class Task9ComputerSystem {
    static class Computer {
        class Processor {
            double frequency;

            Processor(double frequency) {
                this.frequency = frequency;
            }

            void showFrequency() {
                System.out.println("Processor frequency: " + frequency + " GHz");
            }
        }
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        Computer.Processor processor = computer.new Processor(3.5);
        processor.showFrequency();
    }
}