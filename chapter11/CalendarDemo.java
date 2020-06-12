package chapter11;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
 * methods of class Calendar
 */
public class CalendarDemo {
    public static void main(String[] args) throws ParseException {
        /*
         * Calendar is an abstract class, basically,
         * it is implemented by subclass GregorianCalendar
         */
        Calendar cal = Calendar.getInstance();

        /*
         * print current time using Calendar
         */
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;//because the month start from 0
        int day = cal.get(Calendar.DATE);
        int hour = cal.get(Calendar.HOUR);//HOUR is 12 hour system, HOUR_OF_DAY is 24 hour system
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
        int millisecond = cal.get(Calendar.MILLISECOND);
        System.out.println("Current time: ");
        String strTime = String.format("%d-%02d-%02d %d:%d:%d:%s",//02d means 2 bytes wide and fill with 0 if empty
                year, month, day, hour, minute, second, millisecond);
        System.out.println(strTime);

         //set time for Calendar object
        cal.set(2020, 6, 10, 18, 30, 2);
        Date date = cal.getTime();
        System.out.println(date.toLocaleString());

        //Date format class
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        String strDate = format.format(date);
        System.out.println(strDate);

        //parse String to Date
        Date newDate = format.parse("2020-06-10 20:59:59:999 ");
        System.out.println(newDate.toLocaleString());

        GregorianCalendar cal2 = new GregorianCalendar(2020, 5, 10);
        //Callendar cal2 = new GregorianCalendar(2020, 6, 10); //this is also good
        long diff = cal.getTimeInMillis() - cal2.getTimeInMillis();// millisecond from 1970-1-1 to current
        int diffDays = (int)(diff / 1000 / 60 / 60 / 24);
        System.out.println("The difference is " + diffDays + " days");

        //we can add year by using method add()
        cal.add(Calendar.YEAR, 1);
        System.out.println(cal.get(Calendar.YEAR));

        //to gain days of a certain month
        System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH));
    }
}
