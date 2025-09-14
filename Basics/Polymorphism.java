class Animal{
    void sound(){
        
    }
}
 class Cat extends Animal{
     void sound(){
         System.out.println("meow");
     }
 }
 
  class Dog extends Animal{
     void sound(){
         System.out.println("barks");
     }
 }
 
 class Main{
     public static void main(String []ar) {
         Animal ob = new Animal();
         Dog dg = new Dog();
         Cat c  = new Cat();
         ob = dg;
         ob.sound();
         Animal ob2 = new Cat();
         ob2.sound();
     }
 }
