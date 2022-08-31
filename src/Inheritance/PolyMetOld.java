package Inheritance;

public class PolyMetOld {
    // method without parameter
    public void display(){
        for(int i=0; i<10;i++){
            System.out.print("*");
        }

    }

    // method with single parameter
    public void display(char symbol){
        for(int i=0; i<10;i++){
            System.out.print(symbol);

        }

    }

}

class Main{
    public static void main(String[] args) {
        PolyMetOld D1 = new PolyMetOld();

        D1.display();
        System.out.println("\n");

        D1.display('#');


    }

}