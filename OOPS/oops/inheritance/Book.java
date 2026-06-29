package oops.inheritance;

public class Book {

    String title;
    int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public static void main(String[] args) {

        Author author = new Author(
                "Java Programming",
                2024,
                "James Gosling",
                "Creator of Java"
        );

        author.displayInfo();
    }
}

class Author extends Book {

    String name;
    String bio;

    public Author(String title, int publicationYear,
                  String name, String bio) {

        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    void displayInfo() {

        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}
