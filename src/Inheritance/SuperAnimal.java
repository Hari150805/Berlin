package Inheritance;

public class SuperAnimal {
    public void eat(){
        System.out.println("I can eat");

    }

}

class Dog2 extends SuperAnimal{
    // overriding the eat method
    @Override
    public void eat(){
        //call method of superclass
        super.eat();
        System.out.println("I eat dog food");
    }

    public void bark(){
        System.out.println("I can bark as well");

    }
}

