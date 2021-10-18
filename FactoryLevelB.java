package Ass4;

public class FactoryLevelB {

    public Animal createAnimal(String name) {
        switch (name) {
            case "Dog":
                return new Dog();
            default:
                return new Cat();
        }
    }
}