package oops.encapsulation;

public abstract class LibraryItem {

    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Getters
    public int getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Setters
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Abstract Method
    abstract int getLoanDuration();

    // Concrete Method
    public void displayItemDetails() {
        System.out.println("Item ID : " + itemId);
        System.out.println("Title   : " + title);
        System.out.println("Author  : " + author);
    }

    public static void main(String[] args) {

        Book book = new Book(101, "Java Programming", "James Gosling");
        Magazine magazine = new Magazine(102, "Tech Today", "Editor");
        DVD dvd = new DVD(103, "Avengers", "Marvel");

        System.out.println("----- Book -----");
        book.displayItemDetails();
        System.out.println("Loan Duration: " + book.getLoanDuration() + " days");

        System.out.println();

        System.out.println("----- Magazine -----");
        magazine.displayItemDetails();
        System.out.println("Loan Duration: " + magazine.getLoanDuration() + " days");

        System.out.println();

        System.out.println("----- DVD -----");
        dvd.displayItemDetails();
        System.out.println("Loan Duration: " + dvd.getLoanDuration() + " days");
    }
}

class Book extends LibraryItem {

    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    int getLoanDuration() {
        return 14;
    }
}

class Magazine extends LibraryItem {

    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    int getLoanDuration() {
        return 7;
    }
}

class DVD extends LibraryItem {

    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    int getLoanDuration() {
        return 3;
    }
}
