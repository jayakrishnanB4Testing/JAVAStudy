package oopsconcepts.composition;

public class Case {

    private String brand;
    private String model;
    private int powerSupply;
    private Dimension dimension;

    public Case(String brand, String model, int powerSupply, Dimension dimension) {
        this.brand = brand;
        this.model = model;
        this.powerSupply = powerSupply;
        this.dimension = dimension;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getPowerSupply() {
        return powerSupply;
    }

    public Dimension getDimension() {
        return dimension;
    }

}
