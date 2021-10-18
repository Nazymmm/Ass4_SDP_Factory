package Ass4;

public class Bird implements Animal{
    @Override
    public void talk() {
        System.out.println("Chrik");
    }

    @Override
    public void fly() {
        System.out.println("I can fly!");
    }
}
