import java.util.*;
public class date {
    public static void main(String[] args) throws Exception
    {
        Date day = new Date();
        System.out.println(day);
        //Thread.sleep(3000);
        Date newtime = new Date();
        float a = (float)5;
        double c = 5.0000200;
        System.out.println(a);
        System.out.println(c);
        long msDelaay = newtime.getTime() - day.getTime();
        System.out.println("Time difference is:"+ ((double) msDelaay/1000)+" in s");


        // Java program to find the time passed from the Start of the year.

        Date yearDate = new Date();
        {
            yearDate.setHours(4);
            yearDate.setMinutes(25);
            yearDate.setSeconds(0);
            yearDate.setYear(97);
            yearDate.setMonth(10);
            yearDate.setDate(14);
            yearDate.setDate(0);
        }
        System.out.println(yearDate);
        
        Date yearDate1 = new Date();
        
        System.out.println(yearDate1);
        System.out.println((yearDate1.getTime() - yearDate.getTime())/(24*60*60*1000));

        
    }
}
