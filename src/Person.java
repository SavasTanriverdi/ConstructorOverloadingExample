public class Person {
    // Attributes
    private String name;
    private int age;
    private String profession;

    // Constructor with all attributes
    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    // Constructor with name and age, default profession
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.profession = "Unemployed"; // Default value for profession
    }

    // Default constructor with default values
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.profession = "Unemployed";
    }

    // Method to display person information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Profession: " + profession);
        System.out.println();
    }
}
