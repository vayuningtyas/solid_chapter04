import java.util.HashMap; import java.util.Map;

public class InMemoryAuthorRepo implements AuthorRepo {
    private final Map<Integer, Author> authors = new HashMap<>();
    @Override
    public boolean checkAuthorId(int authorId) {
        return authors.containsKey(authorId);
    }

    @Override
    public void save(Author author) {
        authors.put(author.getAuthorId(), author);
    }
}

