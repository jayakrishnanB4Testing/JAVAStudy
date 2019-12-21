package dataTypesByteShortIntLong;

public class Numbers {

    public static void main(String[] args) {

        byte myByteMaxValue = 127;
        byte myByteMinValue = -127;
        byte mewByteValue = (byte) (myByteMaxValue/2);
        //Type casting required as operations on byte will convert it to int

        short myShortMaxValue = 32767;
        short myShortMinBValue = -32768;
        short myShortNewValue = (byte) (myShortMinBValue/2);
        //Type casting required as operations on short will convert it to int

        int myIntMaxValue = 2147483647;
        int myIntMinValue = -2147483647;
        int myNewIntValue = myIntMaxValue/2;

    }
}

