package CompRef;

public class Payroll {
    String firstName;
    String lastName;
    int noOfDays;
    int sickLeaves;
    int salPerDay;

    int totalDays;

    public Payroll(String fn,String ln) {
        this.firstName = fn;
        this.lastName = ln;
    }

    public Payroll(int nod,int sl, int sal, int td){
        this.noOfDays =nod;
        this.sickLeaves =sl;
        this.salPerDay=sal;
        this.totalDays = td;

    }

    public void employeeDet(){

        System.out.println("Employee Name :" +firstName+ " " +lastName);

    }

    // how do we get the exact number of days for any given month

    public void calSalary(){

        int i=0;
        i=totalDays;

        if (i>=30) {
            System.out.println("The Employee has worked the full month");
        }else System.out.println("The Employee had leaves in the month");

        System.out.print("Salary for the month :");
        System.out.println((noOfDays-sickLeaves)*salPerDay);
        System.out.println();
        totalDays = noOfDays-sickLeaves;


        }



    }

