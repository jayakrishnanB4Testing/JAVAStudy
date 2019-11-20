package collections.comparable;

public class Employee {

    private String empFirstname;
    private String empLastname;
    private int empID;

    public Employee(String empFirstname, String empLastname, int empID) {
        this.empFirstname = empFirstname;
        this.empLastname = empLastname;
        this.empID = empID;
    }

    public String getEmpFirstname() {
        return empFirstname;
    }

    public String getEmpLastname() {
        return empLastname;
    }

    public int getEmpID() {
        return empID;
    }
}
