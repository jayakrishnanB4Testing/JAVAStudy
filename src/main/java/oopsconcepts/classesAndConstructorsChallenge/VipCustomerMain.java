package oopsconcepts.classesAndConstructorsChallenge;

public class VipCustomerMain {

    public static void main(String[] args) {
        VipCustomer customer1 = new VipCustomer();
        customer1.getCustomerDetails();

        VipCustomer customer2 = new VipCustomer("Hari", "hari@gmail.com");
        customer2.getCustomerDetails();

        VipCustomer customer3 = new VipCustomer("Jay", "jay@gmail.com", 5000D);
        customer3.getCustomerDetails();
    }

}
