package oopsconcepts.classesAndConstructorsChallenge;

public class VipCustomer {

    private String name;
    private String email;
    private double creditLimit;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public VipCustomer(){
        this("No name", "No email", 0D);
    }

    public VipCustomer(String name, String email) {
        this(name, email, 500D);
    }

    public VipCustomer(String name, String email, double creditLimit){
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public void getCustomerDetails(){
        System.out.println("Customer Name: " + this.getName());
        System.out.println("Customer Email: "  + this.getEmail());
        System.out.println("Credit Limit: " + this.getCreditLimit());
    }
}
