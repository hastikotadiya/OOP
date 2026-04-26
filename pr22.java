class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}
class Library {
    int availableBooks;
    public Library(int books) {
        this.availableBooks = books;
    }
    public void issueBook(int count) throws BookNotAvailableException {
        if (count <= availableBooks) {
            availableBooks -= count;
            System.out.println("Book issued successfully");
            System.out.println("Remaining books: " + availableBooks);
        } else {
            throw new BookNotAvailableException("Requested books not available");
        }
    }
}
public class pr22{
    public static void main(String[] args) {
        Library lib = new Library(3);
        try {
            // First attempt (valid)
            lib.issueBook(2);
            // Second attempt (invalid)
            lib.issueBook(2);
        } catch (BookNotAvailableException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
