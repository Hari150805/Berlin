package CompRef;

public class Player {

    String firstName;
    String lastName;
    int age;


    public Player(String fn, String ln, int a) {

        this.firstName = fn;
        this.lastName = ln;
        this.age = a;

    }

    public void playerDet() {

        if (age >= 16) {
        System.out.println("Player is in the Seniors : " + firstName + " " + lastName +", Age " + age);
        } else System.out.println("player is in the Juniors : " + firstName + " " + lastName + ", Age " + age);

    }

}




