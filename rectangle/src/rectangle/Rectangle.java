/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rectangle;

/**
 *
 * @author RAKIBUL HASAN $
 */
public class Rectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       RectangleClass r1 = new RectangleClass(10.5, 5.5);
        RectangleClass r2 = new RectangleClass();
        r2.setDimensions(7.0, 3.0);

        System.out.println("");
        r1.displayInfo();
        System.out.println("\n-- Rectangle 2 Info --");
        r2.displayInfo();
    }
    
}
