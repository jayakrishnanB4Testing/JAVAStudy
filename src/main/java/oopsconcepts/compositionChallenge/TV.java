package oopsconcepts.compositionChallenge;

public class TV {

    private String brand;
    private String model;
    private String state;
    private Resolution resolution;

    public TV(String brand, String model, Resolution resolution) {
        this.brand = brand;
        this.model = model;
        this.state = "Off";
        this.resolution = resolution;
    }



}
