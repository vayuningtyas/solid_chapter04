public class Main {
    public static void main(String[] args) {
        // Inisialisasi repositori in-memory
        BookRepo bookRepo = new InMemoryBookRepo();
        AuthorRepo authorRepo = new InMemoryAuthorRepo();

        // Inisialisasi layanan
        AuthorService authorService = new AuthorService(authorRepo);
        BookService bookService = new BookService(bookRepo, authorService);

        // Contoh penyimpanan buku
        try {
            bookService.saveBook(1, "Java Programming", "Tech Publisher");
            bookService.saveBook(2, "Python Programming", null); // Publisher akan menjadi "Anonym"
            bookService.saveBook(1, "Java Programming", "Tech Publisher"); // Harus melempar Exception "Duplicate Book"
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Coba mengambil buku yang sudah disimpan
        Book book = bookRepo.findByAuthorIdAndBookName(1, "Java Programming");
        if (book != null) {
            System.out.println("Buku ditemukan: " + book.getName() + " dengan ID Author: " + book.getAuthorId());
        } else {
            System.out.println("Buku tidak ditemukan.");
        }
    }
}
