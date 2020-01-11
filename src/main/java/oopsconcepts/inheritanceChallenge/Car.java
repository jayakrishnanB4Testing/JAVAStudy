package oopsconcepts.inheritanceChallenge;

public class Car extends Vehicle {

    private int wheels;
    private int doors;
    private boolean isManual;
    private int gears;

    private int currentGear;

    public Car(String name, String size) {
        super(name, size);
    }
}
