package CompRef;

// fields constructors methods

//Fields
public class ThreeBox {
    double width;
    double height;
    double depth;
    double pi;
    double radius;
    int length;
    int breadth;


    // constructors

    public ThreeBox (double w,double h, double d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }
    public ThreeBox(double p, double r){
        this.pi =p;
        this.radius=r;
    }

    public ThreeBox(int l,int b ){
        this.length=l;
        this.breadth=b;

    }

    //methods

    //vol of Box
    public double volumeBox(){

        return width*height*depth;
    }

    // Area of Circle

    public double areaCircle(){

        return pi*radius*radius;

    }

    //Area of Rectangle
    public int rectBox(){

        return length*breadth;
    }

}
