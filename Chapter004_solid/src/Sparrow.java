public class Sparrow extends FlyingBird {
    public Sparrow(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " chirps.");
    }
}
