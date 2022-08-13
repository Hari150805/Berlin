public class Test {
    public static void main(String[] args) {
        System.out.println("My first program");
        int num;
        num = 100;
        System.out.println("This value of the num is " +num);
        num=num*2;
        System.out.println("The new value of num is " +num);

        System.out.println(/* If condition */);


        int x,y;
        x = 10;
        y = 20;
        if (x<y) System.out.println("x is lesser than y");
        x=x*2;
        if (x==y) System.out.println("x is equal to y");
        x=x*2;
        if (x>y) System.out.println("x is greater than y");

        System.out.println(/*The For Loop*/);
        x=0;

        for (x = 0; x < 10; x = x+1);

        System.out.println("this is x: " + x);

    }
}
