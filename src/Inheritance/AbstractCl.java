package Inheritance;

abstract class AbstractCl {

    // method of abstract class
    public void display() {
        System.out.println("This is Java Program");
    }
}
    class Abs extends AbstractCl{

    public static void main(String[] args) {
        // create an obj of Main
        Abs obj = new Abs();

        obj.display();

    }
}

