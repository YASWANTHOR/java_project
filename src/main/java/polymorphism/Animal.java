package polymorphism;

// Parent class
class Animal {
    // Overridden method
    public void makeSound() {
        System.out.println("Generic animal sound");
    }
}

// Child class
class Dog extends Animal {
    // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}


