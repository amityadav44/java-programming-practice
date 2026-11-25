
package Challange78;
public class BankAccount {
    // 🔒 Private attributes (data encapsulation)
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // 🏦 Constructor — used to initialize object
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;

        // Ensure initial balance is not negative
        if (initialBalance < 0) {
            System.out.println("❌ Initial balance cannot be negative. Setting balance to 0.");
            this.balance = 0.0;
        } else {
            this.balance = initialBalance;
        }
    }

    // 💰 Method to deposit money
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("❌ Invalid deposit amount.");
        } else {
            balance += amount;
            System.out.println("✅ Deposited ₹" + amount + ". Current balance: ₹" + balance);
        }
    }

    // 💸 Method to withdraw money
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("❌ Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("⚠️ Insufficient balance! Withdrawal denied.");
        } else {
            balance -= amount;
            System.out.println("✅ Withdrawn ₹" + amount + ". Remaining balance: ₹" + balance);
        }
    }

    // 📄 Method to display account details
    public void showDetails() {
        System.out.println("\n----- Account Details -----");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: ₹" + balance);
        System.out.println("---------------------------");
    }
}
