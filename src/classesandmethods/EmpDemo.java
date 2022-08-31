package classesandmethods;

public class EmpDemo {

    public static void main(String[] args) {

        Employee Krishna = new Employee("Krishna", "Bhandari","Raol", "London", 521);
        Employee hari = new Employee("hari","Bhandari", "Raol", "Sydney",253);

        Krishna.printEmpDetails();
        hari.printEmpDetails();
    }
}
