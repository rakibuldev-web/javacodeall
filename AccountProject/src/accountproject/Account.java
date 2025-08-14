/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accountproject;

/**
 *
 * 
 */
public class Account {

    private String accName;
    private String acid;
    private int balance;

    public Account() {
        accName = " ";
        acid = " ";
        balance = 0;
    }

   
    public Account(String accName, String acid, int balance) {
        this.accName = accName;
        this.acid = acid;
        this.balance = balance;
    }

  
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " The money has been deposited. Current balance: " + balance);
        } else {
            System.out.println("Wrong amount");
        }
    }

  
    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + "Money has been withdrawn. Current balance: " + balance);
        } else {
            System.out.println("Insufficient balance or incorrect amount");
        }
    }


    public void showInfo() {
        System.out.println("Account Name: " + accName);
        System.out.println("Account ID: " + acid);
        System.out.println("Balance: " + balance);
    }

 
    public int getBalance() {
        return balance;
    }
}

}
