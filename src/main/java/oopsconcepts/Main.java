package oopsconcepts;

public class Main {

    public static void main(String[] args) {
        Car kia = new Car();
        Car hyundai = new Car();
//        kia = null;

//        kia.modelName = "Seltos"; This violates the rule of encapsulation
//        modelName variable should be hidden to achieve encapsulation
//        the internal workings of Car() class should be hidden
        kia.setModelName("Seltos");
        System.out.println("The model name is: " + kia.getModelName());

    }

}
