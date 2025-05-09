// Superclass: Person
class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    //diaplaying information
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Subclass: Teacher (inherits from Person)
class Teacher extends Person {
    String subject;

    // Constructor (calls super)
    Teacher(String name, int age, String subject) {
        super(name, age); // Initialize Person class
        this.subject = subject;
    }

    void teach() {
        System.out.println(name + " is teaching " + subject);
    }
}

// Class representing a School
class School {
    String schoolName;
    
    // Constructor
    School(String schoolName) {
        this.schoolName = schoolName;
    }

    void welcomeTeacher(Teacher teacher) {
        System.out.println("Welcome " + teacher.name + " to " + schoolName + "!");
    }
}

//Parent class
class Animal {
    //Instance variables
    String name;
    String type;
 
    //constructor 
    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }
    

    //displaying name and type
    public void displayInfo() {
        System.out.println("Animal Name: " + name);
        System.out.println("Type: " + type);
    }
}

// Child class for Mammals
class Mammal extends Animal {
    String sound;

    public Mammal(String name, String type, String sound) {
        super(name, type);
        this.sound = sound;
    }

    public void displayMammalInfo() {
        displayInfo();
        System.out.println("Sound: " + sound);
    }
}

// Child class for Birds
class Bird extends Animal {
    String flyingAbility;

    public Bird(String name, String type, String flyingAbility) {
        super(name, type);
        this.flyingAbility = flyingAbility;
    }

    public void displayBirdInfo() {
        displayInfo();
        System.out.println("Flying Ability: " + flyingAbility);
    }
}

class P1{
    System.out.println("Parent class");
}

class C1 extends P1{
    System.out.println("Child class");
}

void dispalyInfo{
    System.out.println();
}

class Main {
    public static void main(String [] args) {
        P1 obj= new C1();
        obj.displayInfo;
    }
}
// Zoo Management System
public class ZooManagementSystem {
    public static void main(String[] args) {
        Mammal lion = new Mammal("Lion", "Carnivore", "Roar");
        Bird parrot = new Bird("Parrot", "Herbivore", "Can Fly");

        System.out.println("Mammal Information:");
        lion.displayMammalInfo();

        System.out.println("\nBird Information:");
        parrot.displayBirdInfo();
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating a teacher object
        Teacher teacher = new Teacher("Anil", 35, "Mathematics");

        // Display info
        teacher.displayInfo();
        teacher.teach();

        // Creating a school object
        School school = new School("Green Valley High School");
        school.welcomeTeacher(teacher);
    }
}

class C1 {
    void sound() {
        System.out.println("Can make sound");
    }
}

class C2 extends C1{
    void eat() {
        System.out.println("Can eat");
    }
}

class Animal{
    void makeSound() {
        System.out.println("Animals make sound");
    }
}

class Dog extends Animal{ 
    void barks() {
        System.out.println("Dod barks");
    }
}    
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping");
    }
}
class S1 {
    public static void main(String[] args) {
        C2 c1 = new C2();
        c1.eat();
        
        Puppy p1 = new Puppy();
        p1.makeSound();
        p1.barks();
        p1.weep();
    }
}

abstract class A{
    abstract void makeSound();
    void canEat() {
        System.out.println("Can eat");
    }
}

class B extends A {
    super.makeSound();
    void canTalk() {
        System.out.println("Can talk");
    }
}

class C extends B {
    super.makeSound();
    super.canTalk();
    void canWalk() {
        System.out.println("Can easily walk");
    }
}

public class Main
{
	public static void main(String[] args) {
		C a1 = new C();
		a1.canWalk();
		a1.canTalk();
		a1.makeSound();
	}
}