package javaVariablesAlongWithStaticKeyword.instanceVariables;

public class TestEmployee {

    public static void main(String[] args) {
        Employee1 E1 = new Employee1("Jay", 10777);
        Employee1 E2 = new Employee1("Neethu", 10888);

        E1.displayEmployeeDetails();
        E2.displayEmployeeDetails();

        Employee1.companyName = "KPMG";

        E1.displayEmployeeDetails();
        E2.displayEmployeeDetails();

    }

}
