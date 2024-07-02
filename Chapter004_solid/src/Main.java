public class Main {
    public static void main(String[] args) {
        User user = new User("John Doe", "john.doe@example.com");

        UserRepository userRepository = new UserRepository();
        userRepository.saveUser(user);

        EmailService emailService = new EmailService();
        emailService.sendEmail(user, "Welcome to our platform!");


        Book book = new Book("1984", "George Orwell", "1234567890");

        BookRepository bookRepository = new BookRepository();
        bookRepository.saveBook(book);

        NotificationService notificationService = new NotificationService();
        notificationService.sendNotification("New book added: " + book.getTitle());

        Bird sparrow = new Sparrow("Sparrow");
        Bird penguin = new Penguin("Penguin");

        // Demonstrating Liskov Substitution Principle
        letBirdFly(sparrow);
        letBirdFly(penguin);

        sparrow.makeSound();
        penguin.makeSound();
    }

    public static void letBirdFly(Bird bird) {
        if (bird instanceof FlyingBird) {
            ((FlyingBird) bird).fly();
        } else {
            System.out.println(bird.getName() + " can't fly.");
        }
    }
}



