package javaVariablesAlongWithStaticKeyword.staticVariables;

public class Employee {

    String companyName = "Accenture";
    String firstName;
    int empId;

    public Employee(String firstName, int empId) {
        this.firstName = firstName;
        this.empId = empId;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + firstName +
                "\nEmployee ID: " + empId +
                "\nCompany Name: " + companyName);
    }
}
