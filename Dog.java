package Ass4;

public class Dog implements Animal{
    @Override
    public void talk() {
        System.out.println("Woof...");
    }
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
