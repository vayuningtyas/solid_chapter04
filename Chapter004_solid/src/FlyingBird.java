public abstract class FlyingBird extends Bird {
    public FlyingBird(String name) {
        super(name);
    }

    public void fly() {
        System.out.println(getName() + " is flying.");
    }
}
