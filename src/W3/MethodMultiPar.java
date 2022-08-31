package W3;

public class MethodMultiPar {
    static void myMethod(String fName, int age) {
        System.out.println(fName + " is " +age);

    }

    public static void main(String[] args) {
        myMethod("Henry", 25);
        myMethod("Doris", 30);
        myMethod("clark", 40);

    }
}
