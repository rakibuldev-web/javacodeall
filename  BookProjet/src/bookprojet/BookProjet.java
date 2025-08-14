/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bookprojet;

/**
 *
 * @author RAKIBUL HASAN $
 */
public class BookProjet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Book b1 = new Book();
        
        // Using setter-like way manually (since setters not required)
        b1 = new Book("Java Programming", "James Gosling", "B001", "Programming", 5);

        // Using valued constructor
        Book b2 = new Book("Data Structures", "Mark Allen", "B002", "Computer Science", 3);

        // Adding copies to book2
        b2.addBookCopy(2); // Now total should be 5

        // Show book info
        System.out.println("-- Book 1 Info --");
        b1.showInfo();

        System.out.println("\n-- Book 2 Info --");
        b2.showInfo();

        // Show total book count
        System.out.println("\n-- Total Book Info --");
        Book.showTotalBookInfo();
    }
    
}
