package oopsconcepts.compositionChallenge;

public class PlugPoint {

    private String brand;
    private String model;
    private String pointType;

    public PlugPoint(String brand, String model, String pointType) {
        this.brand = brand;
        this.model = model;
        this.pointType = pointType;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getPointType() {
        return pointType;
    }

}
