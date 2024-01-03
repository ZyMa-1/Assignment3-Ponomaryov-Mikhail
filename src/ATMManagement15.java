public class ATMManagement15 {
    public class ATM {
        private double balance;

        public ATM(double initialBalance) {
            this.balance = initialBalance;
        }

        public double checkBalance() {
            return balance;
        }

        public void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawal successful. Remaining balance: " + balance);
            } else {
                System.out.println("Insufficient funds.");
            }
        }

        public void deposit(double amount) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        }
    }

    public static void main(String[] args) {
        ATMManagement15 atmSystem = new ATMManagement15();
        ATM atm = atmSystem.new ATM(1000);

        System.out.println("Initial balance: " + atm.checkBalance());
        atm.withdraw(500);
        atm.deposit(200);
        System.out.println("Final balance: " + atm.checkBalance());
    }
}
