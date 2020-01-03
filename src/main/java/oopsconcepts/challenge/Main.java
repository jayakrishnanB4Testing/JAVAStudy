package oopsconcepts.challenge;

public class Main {

    public static void main(String[] args) {
        BankAccount axis = new BankAccount();

        axis.setAccountNumber(123456789);
        axis.setName("Jayakrishnan");
        axis.setEmail("jkatcet@gmail.com");
        axis.setPhoneNumber(8296454596L);
        axis.setBalance(6000D);

        System.out.println("Balance amount is: " + axis.getBalance());
        axis.depositAmount(100);
        System.out.println("Balance amount is: " + axis.getBalance());

        axis.withdrawAmount(6101);
        System.out.println("Balance amount is: " + axis.getBalance());

        axis.withdrawAmount(300);
        System.out.println("Balance amount is: " + axis.getBalance());
    }

}
