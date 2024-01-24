package ComparableComparatorEquals.Equals;

public class Person {
    private double height;
    private double weight;
    private String ssn; // Social Security Number
    private String phoneNumber;

    // Constructor
    public Person(double height, double weight, String ssn, String phoneNumber) {
        this.height = height;
        this.weight = weight;
        this.ssn = ssn;
        this.phoneNumber = phoneNumber;
    }

    // Getter methods
    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getSsn() {
        return ssn;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Setter methods
    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        // Check if the object is compared with itself
        if (this == obj) {
            return true;
        }

        // Check if obj is an instance of Person
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        // Typecast obj to Person to compare data members
        Person person = (Person) obj;

        // Compare SSN and return accordingly
        return (ssn != null && ssn.equals(person.getSsn()));
    }

    // Override hashCode method
    @Override
    public int hashCode() {
        // Since equals is based on ssn, hashCode should also be based on ssn
        return (ssn != null) ? ssn.hashCode() : 0;
    }

    // Optional: Override toString method for easier debugging
    @Override
    public String toString() {
        return "Person{" +
               "height=" + height +
               ", weight=" + weight +
               ", ssn='" + ssn + '\'' +
               ", phoneNumber='" + phoneNumber + '\'' +
               '}';
    }
}

