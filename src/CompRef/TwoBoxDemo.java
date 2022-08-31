package CompRef;

public class TwoBoxDemo {

    public static void main(String[] args) {
        TwoBox myBox = new TwoBox(5,5,5);
        TwoBox myBox2 = new TwoBox(10,10, 10);


        // compute vol for first box1

        myBox.printVol();
        myBox2.printVol();


    }
}
