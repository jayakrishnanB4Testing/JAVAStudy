package oopsconcepts.compositionChallenge;

public class Room {

    private Clock clock;
    private TV TV;

    public Room(Clock clock, TV oneplusTV) {
        this.clock = clock;
        this.TV = oneplusTV;
    }

    private Clock getClock() {
        return clock;
    }

    public void displayCurrentTime(){
        System.out.println(clock.getTime());
    }

    private TV TV() {
        return TV;
    }
}
