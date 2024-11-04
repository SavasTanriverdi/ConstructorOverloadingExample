ConstructorOverloadingExample

This project demonstrates constructor overloading in Java, where multiple constructors with different parameters are defined within the same class. Constructor overloading allows for flexible object creation, as objects can be initialized with different sets of attributes. In this example, the Person class has three constructors to initialize a Person object with various attribute combinations.
Project Structure

    ConstructorOverloadingExample.java: Contains the Person class with overloaded constructors and a displayInfo method, as well as a main method that demonstrates the use of different constructors.

Code Overview
Key Components

    Constructor Overloading
        Description: Three constructors with different parameter combinations are defined to initialize Person objects with different levels of detail.
        Constructors:
            Person(String name, int age, String profession): Initializes all attributes (name, age, and profession).
            Person(String name, int age): Initializes name and age while setting profession to a default value "Unemployed".
            Person(): Default constructor that sets name to "Unknown", age to 0, and profession to "Unemployed".

    Attributes
        name: The name of the person.
        age: The age of the person.
        profession: The profession of the person, which may have a default value if not specified.

    displayInfo() Method
        Description: Displays the details of a Person object.
        Functionality: Prints name, age, and profession to the console.

Usage

Compile and run the program with the following commands:

    javac Main.java
    java Person.java

Example output:

    Name: Alice
    Age: 30
    Profession: Engineer

    Name: Bob
    Age: 25
    Profession: Unemployed

    Name: Unknown
    Age: 0
    Profession: Unemployed

Key Concepts

    Constructor Overloading: Multiple constructors with different parameters allow flexible object initialization.
    Default Values: Constructors can provide default values for attributes if not all details are specified during object creation.
    Encapsulation: The Person class encapsulates attributes and methods related to a person, making it a modular and reusable structure.

Author

This project serves as an educational example to demonstrate constructor overloading in Java, highlighting different ways to initialize objects with varying levels of information.


