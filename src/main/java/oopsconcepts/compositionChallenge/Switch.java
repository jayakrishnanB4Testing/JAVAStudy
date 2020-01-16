package oopsconcepts.compositionChallenge;

public class Switch {

    private String brand;
    private String model;
    private String switchType;
    private String state;

    public Switch(String brand, String model, String switchType, String state) {
        this.brand = brand;
        this.model = model;
        this.switchType = switchType;
        if(state.equalsIgnoreCase("on") || state.equalsIgnoreCase("off")) {
            this.state = state;
        } else {
            System.out.println("Info: State of the switch \"On\" of \"Off\"");
        }
    }

    public Switch(String brand, String model, String switchType) {
        this(brand, model, switchType, "Off");
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getSwitchType() {
        return switchType;
    }

    public String getState() {
        return state;
    }

    public void turnOnSwitch() {
        if(getState().equalsIgnoreCase("On")) {
            System.out.println("Error: The switch is already on.");
        } else {
            this.state = "On";
        }
    }

    public void turnOffSwitch() {
        if(getState().equalsIgnoreCase("Off")) {
            System.out.println("Error: The switch is already off.");
        } else {
            this.state = "Off";
        }
    }

}
