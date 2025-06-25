package Task_24june;

import java.util.Scanner;

public class Money_withdrawn_ATM {
    public static void main(String[] args) {
        int balance = 100000; // Step 1: Initial balance
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount to withdraw: ");
        int amount = scanner.nextInt();  // Step 2: User input

        // Step 3: Check conditions
        if (amount <= 0) {
            System.out.println("Amount must be greater than zero.");
        } else if (amount % 100 != 0) {
            System.out.println(" Amount must be a multiple of 100.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            // Step 4: Deduct amount
            balance -= amount;
            // Step 5: Display updated balance
            System.out.println(" Withdrawal successful!");
            System.out.println(" Remaining balance: ₹" + balance);
        }
    }
}
