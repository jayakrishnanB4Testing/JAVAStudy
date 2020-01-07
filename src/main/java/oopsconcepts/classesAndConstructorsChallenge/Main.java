package oopsconcepts.classesAndConstructorsChallenge;

public class Main {

    public static void main(String[] args) {
        BankAccount axis = new BankAccount(123456789, "Jayakrishnan", "jkatcet@gmail.com", "8296454596", 6000D);

//        axis.setAccountNumber(123456789);
//        axis.setName("Jayakrishnan");
//        axis.setEmail("jkatcet@gmail.com");
//        axis.setPhoneNumber(8296454596L);
//        axis.setBalance(6000D);

//        System.out.println("Balance amount is: " + axis.getBalance());
        axis.depositAmount(100);
//        System.out.println("Balance amount is: " + axis.getBalance());

        axis.withdrawAmount(6100);
//        System.out.println("Balance amount is: " + axis.getBalance());

        axis.withdrawAmount(300);
//        System.out.println("Balance amount is: " + axis.getBalance());

        BankAccount citi = new BankAccount(112233445, "Hari", "hhhh@gmail.com");
        System.out.println(citi.getPhoneNumber());
        System.out.println(citi.getBalance());
    }

}
