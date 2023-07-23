import component.Employee;
import component.composite.Department;
import component.leaf.IndividualEmployee;

public class Main {
    public static void main(String[] args) {

        /*
        The Composition Pattern allows you to compose objects into a tree like structure
        to represent part-whole hierarchies
        It lets clients treat individual objects and compositions of objects uniformly
         */

        Employee emp1 = new IndividualEmployee("George", "Cleaner");
        Employee emp2 = new IndividualEmployee("Bill", "Security Guard");

        Department department = new Department("Security Department");
        department.addEmployee(emp1);
        department.addEmployee(emp2);


        
        Department company = new Department("XYZ INC");
        company.addEmployee(department);

        company.showDetails();

    }
}