/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book;

/**
 *
 * @author RAKIBUL HASAN $
 */
public class BookTest {
    // Member variables (declared private)
    private String bookName;
    private String bookAuthor;
    private String bookId;
    private String bookType;
    private int bookCopy;

    // Static variable to count book objects
    static int bookCounter = 0;

    // Empty constructor
    public BookTest() {
        bookCounter++;
    }

    // Valued constructor
    public BookTest(String bookName, String bookAuthor, String bookId, String bookType, int bookCopy) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookId = bookId;
        this.bookType = bookType;
        this.bookCopy = bookCopy;
        bookCounter++;
    }

    // Method to show book info
    public void showInfo() {
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + bookAuthor);
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Type: " + bookType);
        System.out.println("Number of Copies: " + bookCopy);
    }

    // Method to add book copies
    public void addBookCopy(int x) {
        if (x > 0) {
            bookCopy += x;
            System.out.println(x + " copies added. Total now: " + bookCopy);
        } else {
            System.out.println("Invalid number of copies to add.");
        }
    }

    // Static method to show total book objects created
    public static void showTotalBookInfo() {
        System.out.println("Total number of book objects created: " + bookCounter);
    }
}

