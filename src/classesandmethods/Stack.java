package classesandmethods;

import javax.swing.*;

public class Stack {
    int Stack[] = new int[10];
    int tos;

    // initialize the top of the stack
    Stack() {
        tos = -1;

    }

    // push an item onto the stack
    void push(int item) {
        if (tos == 9) ;
        System.out.println("Stack is full");

    }

    // pop an item from the stack

    int pop() {
        if (tos < 0) {
            System.out.println("stack is underflow");
            return 0;

        } else
            return Stack[tos--];

    }

    public static void main(String[] args) {
        Stack myStack1 = new Stack();
        Stack myStack2 = new Stack();

        //push some numbers on to stack
        for (int i = 0; 1 < 10; i++) myStack1.push(i);

    }

}









