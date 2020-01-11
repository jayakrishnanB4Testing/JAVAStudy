package systemTimeAndDate;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

public class TimeDate {

    public static void main(String[] args) {
//        Date date = new Date();
//        System.out.println(date);
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        System.out.println(formatter.format(new Date()));

    }

}
