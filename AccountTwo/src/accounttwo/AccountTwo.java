/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package accounttwo;

/**
 *
 * @author RAKIBUL HASAN $
 */
public class AccountTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Account acc1 = new Account("Rahim", "A101", 1000);
        Account acc2 = new Account("Karim", "A102", 500);

        acc1.showInfo();
        acc2.showInfo();

        System.out.println("\n-- Deposit to acc1 --");
        acc1.deposit(200);

        System.out.println("\n-- Withdraw from acc2 --");
        acc2.withdraw(100);

        System.out.println("\n-- Transfer from acc1 to acc2 --");
        acc1.transfer(300, acc2);

        System.out.println("\n-- Final Account Info --");
        acc1.showInfo();
        acc2.showInfo();
    }
    
}
