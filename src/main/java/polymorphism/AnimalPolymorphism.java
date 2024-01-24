package polymorphism;

import polymorphism.Animal;
import polymorphism.Dog;

public class AnimalPolymorphism {
    public static void main(String[] args) {
        // Creating instances of the parent and child classes
        Animal genericAnimal = new Animal();
        Animal myDog = new Dog();

        // Calling the overridden method on the parent class instance
        genericAnimal.makeSound(); // Output: Generic animal sound

        // Calling the overridden method on the child class instance
        myDog.makeSound(); // Output: Woof! Woof!

        // Demonstrating runtime polymorphism
        // The type of the reference determines the method called at runtime
        Animal anotherDog = new Dog();
        anotherDog.makeSound(); // Output: Woof! Woof!
    }
}
