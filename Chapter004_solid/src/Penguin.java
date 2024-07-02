public class Penguin extends NonFlyingBird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " squawks.");
    }
}
