/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package book;

/**
 *
 * @author RAKIBUL HASAN $
 */
public class Book {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          BookTest b1 = new BookTest("Java Basics", "John Doe", "B101", "Programming", 3);
        BookTest b2 = new BookTest("OOP in Java", "Jane Smith", "B102", "Education", 5);

        b1.showInfo();
        System.out.println();
        b2.showInfo();
        System.out.println();

        b1.addBookCopy(2);
        System.out.println();

        BookTest.showTotalBookInfo();
    }
    
}
