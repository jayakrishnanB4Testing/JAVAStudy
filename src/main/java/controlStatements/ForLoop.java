package controlStatements;

public class ForLoop {

    public static void main(String[] args) {
        nestedForLoop(5);
    }

    private static void forLoop(int a) {
        for (int i = 0; i < a; i++) {
            System.out.println("*");
        }
    }

    private static void nestedForLoop(int a) {
        for (int i = 1; i <= a; i++) {
            String b = "";
            for (int j = 1; j <= i; j++) {
                b += "*";
            }
            System.out.println(b);
        }
    }

}
