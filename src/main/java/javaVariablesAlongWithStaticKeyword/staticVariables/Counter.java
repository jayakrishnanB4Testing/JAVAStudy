package javaVariablesAlongWithStaticKeyword.staticVariables;

public class Counter {

    static int counter = 0;

    public Counter() {
        counter++;
        System.out.println(counter);
    }
}
