package oopsconcepts.compositionChallenge;

public class SwitchBoard {

    private Switch aSwitch;
    private PlugPoint plugPoint;
    private int numOfSwitches;
    private int numOfPlugPoints;

    public SwitchBoard(Switch aSwitch, PlugPoint plugPoint, int numOfSwitches, int numOfPlugPoints) {
        this.aSwitch = aSwitch;
        this.plugPoint = plugPoint;
        this.numOfSwitches = numOfSwitches;
        this.numOfPlugPoints = numOfPlugPoints;
    }

    public Switch getaSwitch() {
        return aSwitch;
    }

    public PlugPoint getPlugPoint() {
        return plugPoint;
    }

    public int getNumOfSwitches() {
        return numOfSwitches;
    }

    public int getNumOfPlugPoints() {
        return numOfPlugPoints;
    }
}
