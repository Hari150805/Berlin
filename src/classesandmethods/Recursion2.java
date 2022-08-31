package classesandmethods;

public class Recursion2 {
    int value[];

    Recursion2(int i) {
        value = new int[i];
    }

    //display array recursively
    void printArray(int i){
        if (i==0) return;
        else printArray(i-1);
        System.out.println("["+(i-1)+"]" +value[i-1]);
        }

    public static void main(String[] args) {
        Recursion2 ob = new Recursion2(10);
        int i;

        for (i=0; i<10; i++) ob.value[i] = i;

        ob.printArray(10);


    }
}
