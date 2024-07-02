public class UserManager {
    private String name;
    private String email;

    public UserManager(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Save user to database
    public void saveUser() {
        // Code to save user to database
        System.out.println("User " + name + " saved to database.");
    }

    // Send email to user
    public void sendEmail(String message) {
        // Code to send email
        System.out.println("Email sent to " + email + " with message: " + message);
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void main(String[] args) {
        UserManager userManager = new UserManager("John Doe", "john.doe@example.com");

        // Save user to database
        userManager.saveUser();

        // Send welcome email to user
        userManager.sendEmail("Welcome to our platform!");
    }
}
