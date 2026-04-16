public class Task12BankSystem {
    static class Bank {
        static double interestRate = 10.0;

        static double calculateInterest(double amount) {
            return amount * interestRate / 100;
        }
    }

    public static void main(String[] args) {
        double amount = 50000;
        double interest = Bank.calculateInterest(amount);

        System.out.println("Amount: " + amount);
        System.out.println("Interest: " + interest);
    }
}