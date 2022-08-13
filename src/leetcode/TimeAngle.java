package leetcode;

public class TimeAngle {
    public static void main(String[] args) {
        double deltaBySecsForHour;
        double deltaBySecsForMins;


        int hour = 9;
        int min = 14;
        int sec = 59;

        // for 60 mins , hour angle moves by 30 degrees. so for every min hour angle moves by 30/60
        // for 1 min, hour angle moves by 0.5 degrees
        int hourAngle = hour*30;

        int minAngle = min*6;


        // 60 ------> 30
        // 1 min----------> ??? == 0.5 degrees
        // 60 secs =====> 0.5
        // 1 sec ========> 0.0083
        deltaBySecsForHour = sec * 0.0083;


        // 60 secs  ---->6
        // 1 sec  ------> 6/60 = 0.1
        deltaBySecsForMins =  sec* 0.1;


    double deltaByMinutesForHour =  min*0.5;

    double angle = Math.abs((hourAngle + deltaBySecsForHour) - (minAngle + deltaBySecsForMins));

    double actualAngle = angle + deltaByMinutesForHour;

    System.out.println(actualAngle);

}
}
