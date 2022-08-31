package stack;

import CompRef.StudExamResult;

public class Stack {
    //fields

    StudExamResult studExamResult;
    int[] integerArray;
    private int position;

    //constructor
    public Stack(int size) {
        integerArray = new int[size];
        studExamResult = new StudExamResult(10,10,20,10);
        position = 0;
    }

    //methods
    public void push(int x) {
        if (position <= integerArray.length - 1) {
            integerArray[position] = x;
            System.out.println("success");
            position++;

        } else {
            System.out.println("There is no room in the array");
        }
    }

    public int pop() {
//        integerArray=y;


        if (position == 0) {
            System.out.println("there are no items in the array dude; first add the items please");
            return 0;
        }
        // 1. return the latest item
        int result = integerArray[position - 1] ;
            position = position - 1;
            System.out.println(result);
            return result;


    }

    }
