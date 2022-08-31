package CompRef;

public class BoxEx {
    //program that uses Box class;

    double width;
    double height;
    double depth;

     // public class declares an object
    public static void main(String[] args) {
        BoxEx myBox = new BoxEx();

                double vol;
        myBox.width= 10;
        myBox.height = 20;
        myBox.depth = 10;

        // compute vol of Box

        vol = myBox.width*myBox.height *myBox.depth;

        System.out.println("volume of the Box is :" +vol);

    }

}
