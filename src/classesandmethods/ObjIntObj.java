package classesandmethods;

//Object to initialize another object
public class ObjIntObj {
    double width;
    double height;
    double depth;

    //constructor , it takes an object of type Box

    ObjIntObj(Box ob){
        width = ob.width;
        height = ob.height;

        depth = ob.depth;
    }
    //constructor used when all dimensions specified

    ObjIntObj(double w,double h,double d) {
        width = w;
        height = h;
        depth = d;
    }


    // constructor is used when a cube is created

       ObjIntObj (double len) {
        width=height=depth=len;
       }

       // compute and return volume
    double volume (){
        return width*height*depth;

    }

    public static void main(String[] args) {
        ObjIntObj myBox1 = new ObjIntObj(10,20,15);
        ObjIntObj myCube = new ObjIntObj(7);

        double vol;

        // get volume of first box
        vol = myBox1.volume();
        System.out.println("Volume of myBox is " +vol);

        //get the volume of cube
        vol = myCube.volume();
        System.out.println("Volume of myCube is " +vol);






    }

}
