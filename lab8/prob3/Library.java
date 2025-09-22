package lab8.prob3;

import java.util.HashMap;

public class Library {
    private HashMap<String, Book> books;

    public Library() {
        books = new HashMap<>();
    }

    public void addBook(String ISBN, String title, String author) {
        if (books.containsKey(ISBN)) {
            System.out.println("Book with ISBN " + ISBN + " already exists in the library.");
        } else {
            Book book = new Book(ISBN, title, author);
            books.put(ISBN, book);
            System.out.println("Book added successfully: " + book);
        }
    }

    public void borrowBook(String ISBN) {
        Book book = books.get(ISBN);
        if (book == null) {
            System.out.println("Book with ISBN " + ISBN + " not found in the library.");
        } else if (book.isBorrowed()) {
            System.out.println("Book with ISBN " + ISBN + " is already borrowed.");
        } else {
            book.setBorrowed(true);
            System.out.println("Book borrowed successfully: " + book);
        }
    }

    public void returnBook(String ISBN) {
        Book book = books.get(ISBN);
        if (book == null) {
            System.out.println("Book with ISBN " + ISBN + " not found in the library.");
        } else if (!book.isBorrowed()) {
            System.out.println("Book with ISBN " + ISBN + " was not borrowed.");
        } else {
            book.setBorrowed(false);
            System.out.println("Book returned successfully: " + book);
        }
    }

    public boolean isBookBorrowed(String ISBN) {
        Book book = books.get(ISBN);
        if (book == null) {
            System.out.println("Book with ISBN " + ISBN + " not found in the library.");
            return false;
        }
        return book.isBorrowed();
    }

    public String getBookDetails(String ISBN) {
        Book book = books.get(ISBN);
        if (book == null) {
            return "Book with ISBN " + ISBN + " not found.";
        }
        return book.toString();
    }

    public void listAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
            return;
        }

        System.out.println("\n=== AVAILABLE BOOKS IN LIBRARY ===");
        for (Book book : books.values()) {
            System.out.println(book);
        }

        System.out.println("Total books: " + books.size() + "\n");
    }

    public void listBorrowedBooks() {
        System.out.println("\n=== BORROWED BOOKS ===");
        boolean foundBorrowed = false;

        for (Book book : books.values()) {
            if (book.isBorrowed()) {
                System.out.println(book);
                foundBorrowed = true;
            }
        }

        if (!foundBorrowed) {
            System.out.println("No books are currently borrowed.");
        }
        System.out.println();
    }
}
