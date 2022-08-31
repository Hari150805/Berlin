package classesandmethods;

// Box uses constructor to initialize the dimensions of the box
public class Box5 {
    double width;
    double height;
    double depth;

    // this is the constructor for the box
    Box5() {
        width = 10;
        height = 10;
        depth = 10;
        double vol = 0;
    }
// Compute the return volume

    double volume (){
        return width * height * depth;
            }

    public static void main(String[] args) {
        Box5 myBox1 = new Box5();
        double vol;

        //get vol of the first box

        vol= myBox1.volume();
        System.out.println("Volume of first Box is " + vol);


    }

}
