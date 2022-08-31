package CompRef;

import stack.Stack;

import java.util.Deque;

public class PatientAdmitDetDemo {
    public static void main(String[] args) {
        Patient hari = new Patient("Hari","boyini,", "Berlin,", "Diabetology.");
        Patient hExp = new Patient(30,50);
        Patient krishna = new Patient("Krishna","bhandari,", "London,", "Fitness.");
        Patient kExp = new Patient(50, 20);
        int Expenses;




        hari.admitDet();
        hExp.ExpensesForStay();

        krishna.admitDet();
        kExp.ExpensesForStay();



    }

}
