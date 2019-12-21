package javaVariablesAlongWithStaticKeyword.instanceVariables;

public class Counter1 {

    static int counter = 0;

    public Counter1(){
        counter++;
        System.out.println("Count: " + counter);
    }
}
