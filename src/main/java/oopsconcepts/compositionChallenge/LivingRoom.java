package oopsconcepts.compositionChallenge;

public class LivingRoom {

    public static void main(String[] args) {
        Clock clock = new Clock("Ajanta", "Wall Clock");
        TV tv = new TV("OnePlus", "Q1 Pro", new Resolution("1920","1080"));

        Room livingRoom = new Room(clock, tv);
//        System.out.println(livingRoom.getClock().getTime());
        livingRoom.displayCurrentTime();
    }

}
