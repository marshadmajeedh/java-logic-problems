public class LibraryMain {
    public static void main(String[] args) {

        Book book1 = new Book(1,"Mangatha","Ajith");
        Book book2 = new Book(2,"Jilla","Vijay");
        Book book3 = new Book(3,"Kuthu","Dhanush");

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println ("Let's borrow book : ");
        Book borrowedBook = library.borrowBook(3);
        borrowedBook.printBook();
        System.out.println();

        library.printAllBooks();
        System.out.println();

        System.out.println ("Let's Return book : ");
        Book returnBook = library.returnBook(3);
        returnBook.printBook();
    }
}
