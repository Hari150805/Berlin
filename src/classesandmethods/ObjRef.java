package classesandmethods;

public class ObjRef {
     int a,b;

    //Objects are passed through their reference
    ObjRef(int i , int j){
        a=i;
        b=j;

    }
    // pass an object
    void meth(ObjRef o) {
        o.a *= 2;
        o.b /= 2;

    }

    public static void main(String[] args) {
        ObjRef oB = new ObjRef(15,20);
        System.out.println("oB.a oB.b before call : " +oB.a +"" +oB.b );

        oB.meth(oB);
        System.out.println("oB.a and oB.b after call: " + oB.a+ "" +oB.b );

    }

}
