package classesandmethods;

//Overloading methods
public class Overloading {

    void test() {
        System.out.println("No Parameters");
    }

    // one integer
    void test(int a) {
        System.out.println("a: " +a);
    }

    // two integer
    void test(int a, int b){
        System.out.println("a and b :" + a + "" +b );
    }
    //Overload test for double parameter

    double test(double a){
        System.out.println("double a :" +a);
        return a;
    }

    public static void main(String[] args) {
        Overloading ob = new Overloading();
        double result;

        // call all versions of the test

        ob.test();
        ob.test(10);
        ob.test(10,20);
        result = ob.test(123.5);

        System.out.println("result of Ob test" + result);


    }

}

