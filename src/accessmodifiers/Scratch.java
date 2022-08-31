package accessmodifiers;

public class Scratch {

    String firstName;

    final String location = "LOCAT";

    static String companyName;

    public static int statMethod() {
//        int x = method1();
        return 1;
    }

    public final int method1() {
       int x = statMethod();
        return 0;
    }

    public int method2() {
        return 0;
    }
}
