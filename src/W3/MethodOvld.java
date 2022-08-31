package W3;

public class MethodOvld {
    static int plusMethod(int x, int y){
        return x+y;
    }

    static double plusMethod2(double x, double y){
        return x+y;
        }

    public static void main(String[] args) {
        int myNum1 = plusMethod(8,5);
        double myNum2 = plusMethod2(4.3,6.5);
        System.out.println("int : "+myNum1);
        System.out.println("double : " +myNum2);
    }
}
