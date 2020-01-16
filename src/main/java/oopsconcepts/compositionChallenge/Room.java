package oopsconcepts.compositionChallenge;

public class Room {

    private SwitchBoard switchBoard;

    public Room(SwitchBoard switchBoard) {
        this.switchBoard = switchBoard;
    }

    private SwitchBoard getSwitchBoard() {
        return switchBoard;
    }

    public void switchOn(){
        switchBoard.getaSwitch().turnOnSwitch();
    }

}
