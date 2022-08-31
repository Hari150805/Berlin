package CompRef;

public class ThreeBoxDemo {

    public static void main(String[] args) {
        ThreeBox myVol = new ThreeBox(2,3,4);
        ThreeBox areaCircle = new ThreeBox(3.14,3);
        ThreeBox rectBox = new ThreeBox(5,7);
        double vol;
        double area;
        int rect;


        vol=myVol.volumeBox();
        System.out.println("Volume of Box is :" +vol);

        area= areaCircle.areaCircle();
        System.out.println("Area of a circle is :" +area);

        rect = rectBox.rectBox();
        System.out.println("Rectangle of Box is :" +rect);


    }
}
