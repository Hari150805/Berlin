package W3;

public class methodOvld2 {
    static int plusMethod(int x, int y) {
        return x+y;
    }
    static double plusMethod(double x, double y){
        return x+y;
    }

    public static void main(String[] args) {
        int num1 = plusMethod(2,3);
        double num2 =plusMethod(2.5,3.2);
        System.out.println(+num1);
        System.out.println(num2);
    }

}
