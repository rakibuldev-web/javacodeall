/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accounttwo;

/**
 *
 * @author RAKIBUL HASAN $
 */
public class Account {
    // Member variables (declared private)
    private String accName;
    private String acid;
    private int balance;

    // Empty constructor
    public Account() {
        accName = "";
        acid = "";
        balance = 0;
    }

    // Valued constructor
    public Account(String accName, String acid, int balance) {
        this.accName = accName;
        this.acid = acid;
        this.balance = balance;
    }

    // Deposit method
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        } else {
            System.out.println("Invalid or insufficient funds.");
        }
    }

    // Transfer method (Extended Part)
    public void transfer(int amount, Account receiver) {
        if (amount > 0 && amount <= balance) {
            this.withdraw(amount);
            receiver.deposit(amount);
            System.out.println("Transferred " + amount + " to " + receiver.getAccName());
        } else {
            System.out.println("Transfer failed: Invalid amount or insufficient funds.");
        }
    }

    // Getter for accName (for displaying)
    public String getAccName() {
        return accName;
    }

    // Method to show account info
    public void showInfo() {
        System.out.println("Account Name: " + accName);
        System.out.println("Account ID: " + acid);
        System.out.println("Balance: " + balance);
    }
}

