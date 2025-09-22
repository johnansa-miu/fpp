package lab8.prob3;

public class TestLibrary {
    public static void main(String[] args) {
        Library library = new Library();

        // Add books
        System.out.println("=== ADDING BOOKS ===");
        library.addBook("12345", "Java Programming", "John Doe");
        library.addBook("67890", "Data Structures", "Jane Smith");
        library.addBook("12345", "Java Programming", "John Doe"); // Duplicate ISBN

        // List all books
        library.listAllBooks();

        // Borrow books
        System.out.println("=== BORROWING BOOKS ===");
        library.borrowBook("12345");
        library.borrowBook("67890");
        library.borrowBook("12345"); // Already borrowed

        // List borrowed books
        library.listBorrowedBooks();

        // Check if book is borrowed
        System.out.println("\n=== CHECKING BORROWED STATUS ===");
        System.out.println("Is 12345 borrowed? " + library.isBookBorrowed("12345"));

        // Return a book
        library.returnBook("12345");

        // List borrowed books again
        library.listBorrowedBooks();

        // Get book details
        System.out.println("=== GETTING BOOK DETAILS ===");
        System.out.println(library.getBookDetails("67890"));

        // Try non-existent ISBN
        library.borrowBook("abcde");
        System.out.println(library.getBookDetails("abcde"));
    }
}
