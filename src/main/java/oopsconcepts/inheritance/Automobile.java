package oopsconcepts.inheritance;

public class Automobile {

    private String bodyType;
    private int engineCapacity;
    private String transmission;
    private String breakType;
    private int seatingCapacity;

    public Automobile(String bodyType, int engineCapacity, String transmission, String breakType, int seatingCapacity) {
        this.bodyType = bodyType;
        this.engineCapacity = engineCapacity;
        this.transmission = transmission;
        this.breakType = breakType;
        this.seatingCapacity = seatingCapacity;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public String getBreakType() {
        return breakType;
    }

    public String getTransmission() {
        return transmission;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void start(){
        System.out.println("All automobiles start");
    }

    public void move(){
        System.out.println("All automobiles move");
    }
}
