/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mobile;

/**
 *
 * @author RAKIBUL HASAN $
 */
public class Mobile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MobileTest m1 = new MobileTest("Hasan", "01712345678", "50", "Android", false);
        m1.showInfo();
        System.out.println();
        m1.recharge(30);
        System.out.println();
        m1.callSomeone(20);
        System.out.println();
        m1.showInfo();
    }
    
}
