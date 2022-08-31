package classesandmethods;

public class Box6 {
    double width;
    double height;
    double depth;

    // constructor of the Box
    Box6 (double w,double h,double d) {
        width = w;
        height = h;
        depth = d;
    }
    //compute the return volume
    double volume(){
        return width*height*depth;

    }

    public static void main(String[] args) {
        Box6 myBox1 = new Box6(10, 20, 30);
        Box6 myBox2 = new Box6(2, 4, 6);
        double vol;

        //volume of the first box
        vol = myBox1.volume();
        System.out.println("the volume of first box is " + vol);
        //volume of the second box;
        vol = myBox2.volume();
        System.out.println("the volume of the second box is " + vol);
    }
    }

