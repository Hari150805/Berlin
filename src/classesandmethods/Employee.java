package classesandmethods;

/* Fields ; Constructor ; Methods
 */
public class Employee {

    String firstName;
    String lastName;
    String lineManager;
    int empId;
    String location;

    // Constructor

    public Employee(String firstName, String lastName, String lineManager,String location, int empId){
        this.firstName = firstName;
        this.lastName = lastName;
        this.lineManager= lineManager;
        this.location =location;
        this.empId=empId;
    }

    // Method

    public void  printEmpDetails(){
        System.out.println("Print Emp Details " + firstName + " " + lastName);

    }


}
