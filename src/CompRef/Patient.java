package CompRef;

/* patient Admission Details
fields
Constructors
Methods

 */
public class Patient {
    String firstName, secondName, address, department;
    int Exp, costPerDay, daysOfAdmit;

    //constructors
   public Patient(String fn, String sn, String ad, String dp){
        this.firstName = fn;
        this.secondName = sn;
        this.address = ad;
        this.department = dp;
 }
    public Patient( int doa, int cpd){

        this.daysOfAdmit = doa;
        this.costPerDay = cpd;
 }

// Methods


    public void admitDet() {

        System.out.println("Print Emp Details : " +firstName+ " " +secondName+ " " +address+ " " +department);

    }

    public void ExpensesForStay(){
    Exp = daysOfAdmit*costPerDay;

        System.out.println("Expense details :" +Exp);

    }
}

