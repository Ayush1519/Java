// Parent class
class Animal {
    String name;
    String type;

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

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
