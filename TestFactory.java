package Ass4;

public class TestFactory {
    public static void main(String[] args) {
        FactoryLevelA fl = new FactoryLevelA();
        System.out.println("Dog");
        Animal an = fl.createAnimal("Dog");
        an.fly();
        an.talk();
        System.out.println("Cat");
        Animal ani = fl.createAnimal("Cat");
        ani.talk();
        ani.fly();
    }
}
