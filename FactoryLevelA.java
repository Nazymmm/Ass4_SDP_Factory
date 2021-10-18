package Ass4;

public class FactoryLevelA {

    public Animal createAnimal(String name) {
        switch (name) {
            case "Dog":
                return new Dog();
            default:
                return new Cat();
        }
    }

}