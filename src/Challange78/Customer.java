
package Challange78;
 class Customer {
    public static void main(String[] args) {
        // Creating a new bank account
        BankAccount acc1 = new BankAccount("1234567890", "Amit Yadav", 5000);

        // Display account details
        acc1.showDetails();

        // Deposit money
        acc1.deposit(2000);

        // Withdraw money
        acc1.withdraw(1500);

        // Try invalid operations
        acc1.withdraw(7000);  // withdraw more than balance
        acc1.deposit(-100);   // invalid deposit
        acc1.withdraw(0);     // invalid withdraw

        // Final details
        acc1.showDetails();
    }
}
