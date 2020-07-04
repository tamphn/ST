package academy.learnprogramming;

public abstract class Bird extends Animal implements CanFly {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is peaking");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flapping its wings");
    }
}
