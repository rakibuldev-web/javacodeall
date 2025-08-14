/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookprojet;

/**
 *
 * @author RAKIBUL HASAN $
 */
public class BookClass {
  private String bookName;
    private String bookAuthor;
    private String bookId;
    private String bookType;
    private int bookCopy;

    // Static variable to count total number of book objects
    private static int bookCounter = 0;

    // Empty Constructor
    public Book() {
        bookCounter++;
    }

    // Valued Constructor
    public Book(String bookName, String bookAuthor, String bookId, String bookType, int bookCopy) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookId = bookId;
        this.bookType = bookType;
        this.bookCopy = bookCopy;
        bookCounter++;
    }

    // Method to add book copies
    public void addBookCopy(int x) {
        if (x > 0) {
            bookCopy += x;
        }
    }

    // Method to show book info
    public void showInfo() {
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + bookAuthor);
        System.out.println("Book ID: " + bookId);
        System.out.println("Type: " + bookType);
        System.out.println("Available Copies: " + bookCopy);
    }

    // Static method to show total book object count
    public static void showTotalBookInfo() {
        System.out.println("Total Book Objects: " + bookCounter);
    }
}
