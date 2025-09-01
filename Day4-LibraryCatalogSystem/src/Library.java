import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book borrowBook(int id) {

        Book borrowedBook = null;

        for (Book book : books) {

            if (book.getId() == id && book.isAvailable()) {
                borrowedBook = book;
                book.setAvailable(false);
                break;
            }
        }

        if (borrowedBook == null) {
            System.out.println("Book is not available");
            return null;
        }
        return borrowedBook;
    }

    public Book returnBook(int id) {

        Book returnedBook = null;

        for (Book book : books) {

            if (book.getId() == id && !book.isAvailable()) {
                returnedBook = book;
                book.setAvailable(true);
                break;
            }
        }

        if (returnedBook != null) {
            System.out.println("Book is returned");
        } else {
            System.out.println("Book is not returned");
        }
        return returnedBook;
    }

    public void printAllBooks() {
        for (Book book : books) {
            book.printBook();
            System.out.println ("Available : "+((book.isAvailable()) ? "Yes" : "No"));
            System.out.println();
        }
    }
}
