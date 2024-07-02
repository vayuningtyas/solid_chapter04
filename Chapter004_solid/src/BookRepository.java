public class BookRepository {
    public void saveBook(Book book) {
        // Code to save book to database
        System.out.println("Book '" + book.getTitle() + "' by " + book.getAuthor() + " saved to database.");
    }
}
