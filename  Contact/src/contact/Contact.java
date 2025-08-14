/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contact;

/**
 *
 * @author RAKIBUL HASAN $
 */
public class Contact {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ContactTest c1 = new ContactTest("Rahim", "P101", 25, "01712345678", 'M');

        c1.showPersonInfo();
        System.out.println();

        c1.detectMobileOperator();
    }
    
}
