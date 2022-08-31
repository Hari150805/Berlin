package Inheritance;

public class Prog1Demo {

    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        // The super class may used by itself

        superOb.i = 10;
        superOb.j = 20;

        System.out.println("Contents of superOb : ");

        superOb.showij();
        System.out.println();

        // The sub class has access to all its members

        subOb.i = 4;
        subOb.j = 5;
        subOb.k = 6;

        System.out.println("Contents of the Subob");
        subOb.showK();
        subOb.showij();

        System.out.println();

        System.out.println("Sum of i J and k is :");
        subOb.sum();



    }



}
