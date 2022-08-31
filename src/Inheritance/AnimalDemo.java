package Inheritance;

public class AnimalDemo {
    public static void main(String[] args) {
        // create an object for subclass
        Dog lab = new Dog();

        // access field of super class
        lab.name= "Rohu";
        lab.display();

        // call method of super class using object of subclass

        lab.eat();

    }
}
