package W3;

public class MethodRetVal {
    // void does not return a value , hence use int or char
    static int myMethod(int x){
        return 5 + x;
    }

    public static void main(String[] args) {
        System.out.println(myMethod (3) );
    }
}
