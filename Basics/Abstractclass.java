abstract class Animal {
    abstract void makeSound();
        
        Animal() {  //Constructor
            System.out.println("It is a Abstract class Constructor");
        }

        void canEat() {
            System.out.println("Animals can eat");
        }
}

//here we have used runtime polymorphism
class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barking");
    }
}

class Cat extends Animal {
    void makeSound() {
        //cat says meow
        System.out.println("Cat says meow meow");
    }
}

class Main {
    public static void main(String[] args) {
        //using animal class 
        Animal myAnimal1 = new Dog();
        Animal myAnimal2 = new Cat();
        myAnimal1.makeSound();
        myAnimal1.canEat();
        
        myAnimal2.makeSound();
        myAnimal2.canEat();

    }
}