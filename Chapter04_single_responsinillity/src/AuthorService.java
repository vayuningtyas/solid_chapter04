public class AuthorService {
    private final AuthorRepo authorRepo;

    public AuthorService(AuthorRepo authorRepo) {
        this.authorRepo = authorRepo;
    }

    public void saveIfNotExist(int authorId) {
        boolean existedAuthor = authorRepo.checkAuthorId(authorId);
        if (!existedAuthor) {
            Author author = new Author();
            author.setName("unknown");
            author.setAuthorId(authorId);
            authorRepo.save(author);
        }
    }
}
