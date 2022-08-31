package classesandmethods;

public class IncbyTen {
    //returning an object
    int a;

    IncbyTen(int i){
        a=i;
    }

    IncbyTen test(){
        IncbyTen temp = new IncbyTen(a+10);
        return temp;

         }

    public static void main(String[] args) {
        IncbyTen ob1 = new IncbyTen(2);
        IncbyTen ob2;

        ob2= ob1.test();
        System.out.println("ob1.a: " +ob1.a);
        System.out.println("ob2.a" +ob2.a);

        ob2=ob2.test();
        System.out.println("ob2.a: after second increase " +ob2.a );

    }



}
