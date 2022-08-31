package classesandmethods;

public class Objparameter {
    int a, b;

    Objparameter(int i, int j){

        a=i;
        b=j;
    }

    // return true if o is equal to the invoking object

    boolean equalTo(Objparameter o){
        if (o.a==a && o.b==b) return true;
        else return false;
    }

    public static void main(String[] args) {
        Objparameter oB1 = new Objparameter(100,22);
        Objparameter oB2 = new Objparameter(100,22);
        Objparameter oB3 = new Objparameter(-1,-1);

        System.out.println("oB1 ==oB2 "+oB1.equalTo(oB2));
        System.out.println("oB1 ==oB3 "+oB1.equalTo(oB3));

    }


}
