import java.util.Scanner;

public class EmployeeTest {
    public static void main (String[] args) {
        Employee emp1 = new Employee("", "", 1);
        Employee emp2 = new Employee("", "", 2);
        employees(emp1, emp2);
    }

    private static void employees(Employee emp1, Employee emp2) {
        Scanner sn = new Scanner(System.in);

        System.out.println("Enter 1st name: ");
        emp1.setF_name(sn.next());
        System.out.println("Enter last name: ");
        emp1.setL_name(sn.next());
        System.out.println("Enter the Salary: ");
        emp1.setSalary(sn.nextDouble());

        System.out.println("Enter 1st name: ");
        emp2.setF_name(sn.next());
        System.out.println("Enter last name: ");
        emp2.setL_name(sn.next());
        System.out.println("Enter the Salary: ");
        emp2.setSalary(sn.nextDouble());

        emp1.employeeInfo();
        emp2.employeeInfo();

    }
}
