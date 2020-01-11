package oopsconcepts.composition;

public class PCClass {

    public static void main(String[] args) {

        Motherboard mboard = new Motherboard("ASUS", "Stealth", 4, 3, "v2.32.1");
        Monitor monitor = new Monitor("LG", "Ultimate Gamer", 36, new Resolution(1920, 1080));
        Dimension caseDimension = new Dimension(32, 10, 25);
        Case pcCase = new Case("Coolermaster", "HAF120", 750, caseDimension);

        PC gamingPC = new PC(mboard, monitor, pcCase);
        System.out.println(gamingPC.getTheCase().getBrand());
        gamingPC.getMonitor().paintAtPixel(3, 10, "orange");

    }

}
