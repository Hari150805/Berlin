package classesandmethods;

public class Constdemo {
    double width;
    double height;
    double depth;

    // const used when all dim are used
    Constdemo (double w,double h,double d) {
        width = w;
        height = h;
        depth = d;
    }
    // const used when no dimensions specified
    Constdemo (){
        width = -1;
        height= -1;
        depth = -1;
    }
    // const used when cube is created
    Constdemo (double len){
        width = height = depth = len;

    }
    // compute and return volume
    double volume (){
        return width*height*depth;

    }

    public static void main(String[] args) {
        Constdemo myBox1 = new Constdemo(10,20,30);
        Constdemo myBox2 = new Constdemo();
        Constdemo myCube = new Constdemo(7);
        double vol;

        //get volume of first box

        vol=myBox1.volume();
        System.out.println("the volume of the first box " +vol);

        //get the volume of the next box

        vol=myBox2.volume();
        System.out.println("the volume of the second box " +vol);

        //get volume of the cube
        vol=myCube.volume();
        System.out.println("the Volume of the third box " +vol);

    }



}
