package CompRef;

public class StudExamResult {
    String firstName;
    String lastName;
    int rollNum;
    String subject;
    int maths;
    int physics;
    int chemistry;
    int totMarks;
//    double average;

    public StudExamResult(String fn,String ln,int rn ){
        this.firstName = fn;
        this.lastName = ln;
        this.rollNum = rn;
        }
    public StudExamResult(int ph,int ch,int mt, int tm){
        this.physics = ph;
        this.chemistry =ch;
        this.maths=mt;
        this.totMarks=tm;
//        this.average=avg;
    }

    public int getAverage() {
        return 0;
    }

    public void student(){
        System.out.println("Student Name : " +firstName+" "+lastName+"; Roll Num :" +rollNum);

    }

    public void results(int x) {
//        static   final
    }
    public void results(){
        System.out.println("Marks in Physics :"+physics+ ", Chemistry : "+chemistry+"and Maths :"+maths);
        totMarks = physics + chemistry + maths;
        int average;
        average = totMarks /3;

        System.out.print("Student Total Marks "+totMarks+"; ");
        System.out.println(" Average :" +average+" %");

        double i;
       i= average;



        if (i >50 && i<69) {
            System.out.println("The Student has passed");
        } else if (i>=70 && i<84){
            System.out.println("The Student got First Class");
        } else if (i>=85){
            System.out.println("The Student got a distinction");
        } else
            System.out.println("Student needs to work harder");
            System.out.println();

    }

    }
