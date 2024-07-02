public class Book {
    private int authorId;
    private String name;
    private String publisher;

    // Constructor
    public Book(int authorId, String name, String publisher) {
        this.authorId = authorId;
        this.name = name;
        this.publisher = publisher;
    }

    // Default Constructor
    public Book() {}

    // Getters and Setters
    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}