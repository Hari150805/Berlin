package leetcode;

/**
 * Write a program to print out following using for-each loop
 *
 * 2 * 1 = 28
 * 2 * 2 = 4
 * ... until
 *
 * 2 * 10 = 20
 *
 */
public class MultiplicationTable {
    public static void main(String[] args) {

//        int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int i = 0;
//        for (int x : num) {
//            x = x * 2;
//            i = ++i;
//            {
//                System.out.println("2 * " + i+ " = " +x );
//
//            }
//        }

        for (int i=0;i < 11; i = i +1) {

            System.out.println("2 * " + i + " = " +  2*i);

        }


    }
}

