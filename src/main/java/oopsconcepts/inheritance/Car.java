package oopsconcepts.inheritance;

public class Car extends Automobile{

    private String steeringType;
    private String airConditioning;
    private int numOfDoors;

    public Car(int engineCapacity, String gearboxType, String breakType, int seatingCapacity, String steeringType, String airConditioning, int numOfDoors) {
        super("Car Chassis", engineCapacity, gearboxType, breakType, seatingCapacity);
        this.steeringType = steeringType;
        this.airConditioning = airConditioning;
        this.numOfDoors = numOfDoors;
    }

    public String getSteeringType() {
        return steeringType;
    }

    public String getAirConditioning() {
        return airConditioning;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public void electricStart() {
        System.out.println("Cars start using electric start");
    }

    @Override
    public void start() {
        System.out.println("Car start called");
        electricStart();
        super.start();
    }
}
