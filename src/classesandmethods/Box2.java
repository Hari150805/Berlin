package classesandmethods;
// this program declares two box objects
public class Box2 {
    double width;
    double height;
    double depth;

    public static void main(String[] args) {
        Box2 myBox1 = new Box2();
        Box2 myBox2 = new Box2();
        double vol;
        double vol2;

        //Assign values to myBox1 instance variables
        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        /*Assign different values to myBox2 variable
        */
        myBox2.width = 5;
        myBox2.height =3;
        myBox2.depth =3;

        //compute volume for first box

        vol =   myBox1.width * myBox1.height *  myBox1.depth;
        System.out.println("Volume for first Box is " + vol );

        //compute volume for first box

        vol2 =  myBox2.width * myBox2.height *  myBox2.depth;
        System.out.println("volume for Second Box is " +vol2);




    }

}
