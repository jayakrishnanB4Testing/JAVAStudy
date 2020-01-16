package oopsconcepts.compositionChallenge;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class Clock {

    private String brand;
    private String model;
    private String time;

    public Clock(String brand, String model) {
        this.brand = brand;
        this.model = model;
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");
        this.time = formatter.format(date);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getTime() {
        return time;
    }

    public void setAlarm() {
        System.out.println("Alarm has been set");
    }
}
