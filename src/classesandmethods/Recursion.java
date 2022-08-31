package classesandmethods;

public class Recursion {
    // this is a recursive method
    int fact (int n){

        int result;
        if (n==1) return 1;
        result = fact (n-1)*n;
        return result;
        }

    public static void main(String[] args) {
        Recursion f = new Recursion();

        System.out.println("Recursion of 3 is " +f.fact(3));
        System.out.println("Recursion of 4 is " +f.fact(4));
        System.out.println("Recursion of 5 is " +f.fact(5));

    }
}
