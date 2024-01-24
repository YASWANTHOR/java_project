package ComparableComparatorEquals.Equals;

public class Main {
    public static void main(String[] args) {
        // Create two Person objects with the same SSN
        Person person1 = new Person(5.8, 150, "123-45-6789", "555-1234");
        Person person2 = new Person(5.9, 155, "123-45-6789", "555-5678");

        // Create a third Person object with a different SSN
        Person person3 = new Person(5.7, 145, "987-65-4321", "555-9101");

        // Comparing person1 and person2
        if (person1.equals(person2)) {
            System.out.println("person1 and person2 are considered the same person (based on SSN).");
        } else {
            System.out.println("person1 and person2 are considered different people.");
        }

        // Comparing person1 and person3
        if (person1.equals(person3)) {
            System.out.println("person1 and person3 are considered the same person (based on SSN).");
        } else {
            System.out.println("person1 and person3 are considered different people.");
        }
    }
}

