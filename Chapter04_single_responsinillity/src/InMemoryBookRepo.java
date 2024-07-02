import java.util.HashMap; import
        java.util.Map;

public class InMemoryBookRepo implements BookRepo {
    private final Map<String, Book> books = new HashMap<>();
    @Override
    public void save(Book book) {
        String key = book.getAuthorId() + "-" + book.getName();
        books.put(key, book);
    }

    @Override
    public Book findByAuthorIdAndBookName(int authorId, String bookName) {
        String key = authorId + "-" + bookName;
        return books.get(key);
    }
}
