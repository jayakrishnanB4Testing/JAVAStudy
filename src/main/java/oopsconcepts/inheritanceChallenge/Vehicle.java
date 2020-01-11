package oopsconcepts.inheritanceChallenge;

public class Vehicle {

    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void steer(String direction) {
        System.out.println("Vehicle is steering to " + direction + " direction");
    }

    public void move(String direction, int velocity) {
        System.out.println("Vehicle is steering to " + direction + " direction at velocity " + velocity);
    }

}
