package garbageCollection;


public class Test {

    public Test() {
    }



    public Test(int count) {
        for(int i=0; i < count; i++) {
            new Test();
        }
    }

    public void finalize() {
        System.out.println("garbage collection acting..");
    }
}
