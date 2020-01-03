package oopsconcepts.challenge;

import javax.print.DocFlavor;

public class BankAccount {

    private int accountNumber;
    private String name;
    private String email;
    private long phoneNumber;
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

    public void setPhoneNumber(long phoneNumber) {
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

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void depositAmount(double amount){
        setBalance(this.balance+=amount);
        System.out.println("New balance in " + getAccountNumber() + " is: " + getBalance());
    }

    public void withdrawAmount(double amount){
        if ((this.balance-amount) < 0){
            System.out.println("Withdrawal of " + amount + " will result in negative balance");
        }
        else{
            setBalance(this.balance-amount);
            System.out.println("New balance in " + getAccountNumber() + " is: " + getBalance());
        }
    }

}
