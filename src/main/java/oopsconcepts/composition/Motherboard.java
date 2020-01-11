package oopsconcepts.composition;

public class Motherboard {

    private String brand;
    private String model;
    private int ramSlots;
    private int cardSlots;
    private String biosVersion;

    public Motherboard(String brand, String model, int ramSlots, int cardSlots, String biosVersion) {
        this.brand = brand;
        this.model = model;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.biosVersion = biosVersion;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBiosVersion() {
        return biosVersion;
    }
}