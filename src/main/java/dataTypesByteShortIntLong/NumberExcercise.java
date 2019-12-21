package dataTypesByteShortIntLong;

public class NumberExcercise {

    public static void main(String[] args) {

        byte byteValue = 100;
        short shortValue = 30000;
        int intValue = 250000;

        long longValue = 50000L + 10L*(byteValue + shortValue + intValue);
        System.out.println("Long value is: " + longValue);

    }

}
