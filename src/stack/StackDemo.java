package stack;

public class StackDemo {

    public static void main(String[] args) {
        Stack stack1 = new Stack(3);

        stack1.push(304930593);
        stack1.push(67467836);
        stack1.push(34);

        stack1.pop();
        stack1.pop();
        stack1.pop();
        stack1.push(34);
        stack1.pop();
        stack1.pop();
        //1. create stack with size 3, insert 3 itmes, pull out three items, run the program
    }
}
