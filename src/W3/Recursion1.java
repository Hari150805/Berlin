package W3;
//adding all numbers up to 10
public class Recursion1 {
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
    }

    public static int sum(int K){
        if (K>0) {
            return K + sum (K-1);
        } else {
            return 0;
        }

    }



}
