package classesandmethods;

/* A program that uses the box1 class
Call this BoxDemo1.Java
 */
public class Box1 {
    double width;
    double height;
    double depth;

    public static void main(String[] args) {
        Box1 myBox = new Box1();
        double vol;

        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;

        //compute volume of the box

        vol = myBox.width * myBox.height * myBox.depth;

        System.out.println("Volume is " + vol);
    }
}
