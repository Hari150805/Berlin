package classesandmethods;

public class Box3 {
    double width;
    double height;
    double depth;

    void volume (){
        System.out.print("Volume is ");
        System.out.println(width*height*depth);
    }

    public static void main(String[] args) {
        Box3 myBox1 = new Box3 ();
        Box3 myBox2 = new Box3 ();

        //Assign values to myBox1 instance Variables
        myBox1.width= 10;
        myBox1.height= 5;
        myBox1.depth= 2;
        /*Assign values to myBox2 instance Variables
                 */

        myBox2.width= 2;
        myBox2.height=3;
        myBox2.depth=1;

        //display volume of first box
        myBox1.volume();

        //display volume of second box
        myBox2.volume();

    }

    }