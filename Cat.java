package Ass4;

public class Cat implements Animal{
    @Override
    public void talk() {
        System.out.println("Meow...");
    }

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
