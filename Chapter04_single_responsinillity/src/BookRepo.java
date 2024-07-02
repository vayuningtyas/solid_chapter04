public interface BookRepo {
    void save(Book book);
    Book findByAuthorIdAndBookName(int authorId, String bookName);
}


