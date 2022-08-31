package Inheritance;

public class A {
    // create a super class
    int i,j;

    void showij(){
        System.out.println("i and j" +i+""+j);
    }
}

    //create a subclass by extending Prog1
    class B extends A {
        int k;

        void showK() {
            System.out.println("K :" + k);
        }

    void sum() {
        System.out.println("i+j+k : "+(i+j+k));
    }

    }


