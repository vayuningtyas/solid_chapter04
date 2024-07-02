public class BookService {
    private final BookRepo bookRepo;
    private final AuthorService authorService;

    public BookService(BookRepo bookRepo, AuthorService authorService) {
        this.bookRepo = bookRepo;
        this.authorService = authorService;
    }

    public void saveBook(int authorId, String bookName, String publisher) throws Exception {
        validateBook(authorId, bookName);
        authorService.saveIfNotExist(authorId);
        String publisherName = getPublisherName(publisher);
        Book book = new Book();
        book.setAuthorId(authorId);
        book.setName(bookName);
        book.setPublisher(publisherName);
        bookRepo.save(book);
    }

    private String getPublisherName(String publisher) {
        if (publisher != null) {
            return publisher;
        } else {
            return "Anonym";
        }
    }

    private void validateBook(int authorId, String bookName) throws Exception {
        if (bookName == null) throw new Exception("Book name is null");
        Book bookByAuthorIdAndBookName = bookRepo.findByAuthorIdAndBookName(authorId, bookName);
        if (bookByAuthorIdAndBookName != null) {
            throw new Exception("Duplicate Book");
        }
    }
}
