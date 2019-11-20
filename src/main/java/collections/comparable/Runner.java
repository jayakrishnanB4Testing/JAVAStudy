package collections.comparable;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args){

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Hari", "Krishnan", 125444));
        employeeList.add(new Employee("Sam", "Broddy", 125888));

        for(Employee l : employeeList){
            System.out.println(l);
        }

    }
}
