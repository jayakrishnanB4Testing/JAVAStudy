package javaVariablesAlongWithStaticKeyword.staticVariables;

public class TestEmployee {

    public static void main(String[] args) {
        Employee E1 = new Employee("Jay", 10777);
        Employee E2 = new Employee("Neethu", 10888);

        E1.displayEmployeeDetails();
        E2.displayEmployeeDetails();

        E1.companyName = "KPMG";

        E1.displayEmployeeDetails();
        E2.displayEmployeeDetails();

    }

}
