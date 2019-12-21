package dataTypesByteShortIntLong;

public class Boolean {
    public static void main(String[] args) {

        boolean a = false;
        if (a == true){
            System.out.println("The value is true");
        }

        //Ternary Operator
        boolean b = a ? false : true;
        System.out.println(b);

        String c = a ? "The value is true" : "The value is false";
        System.out.println(c);

    }
}
