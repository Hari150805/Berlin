package W3;

public class MethodIfElse {
    static void CheckMyAge(int age) {

        if (age < 18) {

            System.out.println("Access denied  - you are small");
        } else {
            System.out.println("Access Granted - Congrats");
        }

    }

    public static void main(String[] args) {
        CheckMyAge(10);
    }
}
