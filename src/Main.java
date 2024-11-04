public class Main {
    public static void main(String[] args) {
        // Creating objects of Person class using different constructors
        Person person1 = new Person("Alice", 30, "Engineer");
        Person person2 = new Person("Bob", 25);  // Uses default profession
        Person person3 = new Person(); // Uses default values

        // Displaying person details
        person1.displayInfo();
        person2.displayInfo();
        person3.displayInfo();
    }
}