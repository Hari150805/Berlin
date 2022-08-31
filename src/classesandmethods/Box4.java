package classesandmethods;

// This program uses a parameterized method


public class Box4 {
    double width;
    double height;
    double depth;

    //compute and return volume
    double volume (){
        return width*height*depth;
    }
    //set dimensions of Box
    void setDim (double w, double h, double d){
        width=w;
        height=h;
        depth=d;
    }

    public static void main(String[] args) {
        Box4 myBox1 = new Box4();
        Box4 myBox2 = new Box4();
        double vol;

        //initialize each Box
        myBox1.setDim(10,20,15);
        myBox2.setDim(3,6,9);

        //get volume of first box
        vol = myBox1.volume();
        System.out.println("Volume is first Box is " +vol);

        //get volume of second Box
        vol=myBox2.volume();
        System.out.println("volume of second Box is " +vol);

        }
}
