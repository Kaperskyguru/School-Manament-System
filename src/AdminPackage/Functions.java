package AdminPackage;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Kapersky
 */
public class Functions {

    public Functions() {

    }

    public String getTime() {
        String pm;
        Date dat = new Date();
        String date = dat.toString();
        Calendar cal = new GregorianCalendar();
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int year = cal.get(Calendar.YEAR);
        int min = cal.get(Calendar.MINUTE);
        int sec = cal.get(Calendar.SECOND);
        int hour = cal.get(Calendar.HOUR);
        int am = cal.get(Calendar.AM_PM);

        if (am == 1) {
            pm = "PM";
        } else {
            pm = "AM";
        }
        String y = date.substring(0, 7);
        String time = y + " " + day + ":" + month + ":" + year + ":" + " " + hour + ":" + min + ":" + sec + " " + pm;

        return time;
    }
//
//    public static void main(String[] a) {
//        new Functions();
//
//    }

  
}
