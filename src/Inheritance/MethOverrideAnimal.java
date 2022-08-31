package Inheritance;

public class MethOverrideAnimal {
    public void eat(){
        System.out.println("I can eat");
        }
}

// Dog inherits Animal

class Cat extends MethOverrideAnimal{
    //overriding eat method
//We have used the @Override annotation to tell the compiler that we are overriding a method.
    @Override
    public void eat(){
        System.out.println("I eat Cat food");
    }
    public void bark(){
        System.out.println("I can meow");
    }
}