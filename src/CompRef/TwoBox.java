package CompRef;

// Fields Constructors methods and objects
public class TwoBox {
    double width;
    double height;
    double depth;

    //constructors

    public TwoBox(double w, double h,double d ){
        this.width=w;
        this.height=h;
        this.depth=d;
    }

    // methods

    public void printVol(){
        System.out.print("This is the Vol of the first Box :" );
        System.out.println(width*height*depth);

    }

}
