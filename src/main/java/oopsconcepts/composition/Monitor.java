package oopsconcepts.composition;

public class Monitor {

    private String brand;
    private String model;
    private int size;
    private Resolution resolution;

    public Monitor(String brand, String model, int size, Resolution resolution) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.resolution = resolution;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getSize() {
        return size;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void paintAtPixel(int x, int y, String colour) {
        System.out.println("Painted " + colour + " colour in pixel at " + x + " length and " + y + " height");
    }
}
