package Inheritance;

// parent class
@Deprecated
public class Animal {
    String name;
    public void eat (){
        System.out.println("I can eat");
    }
}
// Inherit from animal

class Dog extends Animal{

    //new method in subclass
    public void display(){
        System.out.println("My name is " +name);

    }
}