package CompRef;

public class PayrollDemo {
    public static void main(String[] args) {
        Payroll employee = new Payroll("Dennis","Leed");
        Payroll employee2 = new Payroll("Paris", "Hilton");
        Payroll employee3 = new Payroll("Harry", "Burns");
        Payroll money = new Payroll(30,5,100, 25);
        Payroll money2 = new Payroll(30, 2,120,28);
        Payroll money3 = new Payroll(30,0,130,30);


        employee.employeeDet();
        money.calSalary();
        employee2.employeeDet();
       money2.calSalary();
        employee3.employeeDet();
        money3.calSalary();


    }
}
