package oopsconcepts.classesAndConstructorsChallenge;

public class BankAccount {

    private int accountNumber;
    private String name;
    private String email;
    private String phoneNumber;
    private double balance;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void depositAmount(double amount){
        setBalance(this.balance+=amount);
        System.out.println(amount + " deposited into " + this.accountNumber + ". New balance in " + getAccountNumber() + " is: " + getBalance());
    }

    public void withdrawAmount(double amount){
        if ((this.balance-amount) < 0){
            System.out.println("Only " + this.balance + " available. Withdrawal cannot be processed.");
        }
        else{
            setBalance(this.balance-amount);
            System.out.println(amount + " withdrawn from " + this.accountNumber + ". New balance in " + getAccountNumber() + " is: " + getBalance());
        }
    }

    public BankAccount() {
        System.out.println("Bank account created with empty values");
    }

    public BankAccount(int accountNumber, String name, String email, String phoneNumber, double balance) {
//        this();
        this(accountNumber, name, email, phoneNumber);
//        this.accountNumber = accountNumber;
//        this.name = name;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
        this.balance = balance;
        System.out.println("Bank account created");
    }

    public BankAccount(int accountNumber, String name, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(int accountNumber, String name, String email) {
        this(accountNumber, name, email, "0000000000", 0D);
    }
}
