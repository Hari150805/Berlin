package Inheritance;

public class PolymorphicVar {
    public void display(){
        System.out.println("I am a programming Language");
    }
}

class Java extends PolymorphicVar{
    @Override
    public void display(){
        System.out.println("Im OOP");

        }

}

class Poly {
    public static void main(String[] args) {
        // declare an object variable

        PolymorphicVar Pv;

        Pv = new  PolymorphicVar();
        Pv.display();

        Pv = new Java();
        Pv.display();





    }


}
