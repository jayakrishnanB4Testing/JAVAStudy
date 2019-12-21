package javaVariablesAlongWithStaticKeyword.instanceVariables;

public class Counter {

    int counter = 0;

    public Counter(){
        counter++;
        System.out.println("Count: " + counter);
    }
}
