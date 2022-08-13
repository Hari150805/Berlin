package leetcode;

public class Longtest {
    public static void main(String[] args) {
        //distance light travels using long variable
        long Lightspeed;
        long distance;
        long days;
        long seconds;
        //approx speed of light in miles per second
        long lightspeed = 186000;
        days = 1000;
        seconds = days*24*60*60;
        distance=lightspeed*seconds;
        System.out.print("In" +days);
        System.out.print("days light will travel about");
        System.out.println(distance+"miles");
            }
}
