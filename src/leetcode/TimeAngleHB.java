package leetcode;

/**
 * Include seconds to this
 */
public class TimeAngleHB {

    public static void main(String[] args) {

        int hour = 6;
        int min = 15;
        double sec = 30;

        int hourAngle = hour*30;
        int minAngle = min*6;
        double secAngle = sec*3.75;
        double sum = minAngle + secAngle;


        //for 60 min, hour angle moves by 30 degrees , so for every minute hour angle moves by 30/60
        // for 1 min , hour angle moves by 0.5 degrees
        // for every second the hour angle will move by 30/60*60 = 0.008

        double deltaHourAngle = min*0.5;

        double angle = Math.abs(hourAngle-sum);

        double actualAngle= angle + deltaHourAngle;

        System.out.println(actualAngle);

     }
}
