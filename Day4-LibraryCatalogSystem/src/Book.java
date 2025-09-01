public class Book {
    private int id;
    private boolean isAvailable;
    private String title;
    private String author;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        setAvailable(true);
    }

    public String getAuthor() {
        return author;
    }

    public int getId() {
        return id;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void printBook() {

        System.out.println ("ID : "+id);
        System.out.println ("Title : "+title);
        System.out.println ("Author : "+author);
    }
}
