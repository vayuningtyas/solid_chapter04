public interface AuthorRepo {
    boolean
checkAuthorId(int authorId);
    void save(Author author);
}
