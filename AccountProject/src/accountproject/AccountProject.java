/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package accountproject;

/**
 *
 * @author RAKIBUL HASAN
 */
public class AccountProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Account acc1 = new Account("Dajbangla ", "A101", 100);
        acc1.showInfo();

        System.out.println();

        acc1.deposit(50);    
        acc1.withdraw(30);   
        acc1.withdraw(50);  

        System.out.println();

       
        Account acc2 = new Account();
        acc2.deposit(10);  
        acc2.withdraw(5);
    }
}