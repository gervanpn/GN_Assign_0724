public class Employee {

    private String f_name;
    private String l_name;
    private double salary;
    private double raise;
    private double total;
    public Employee(String first, String last, double sal) {
        f_name = first;
        l_name = last;
        salary = sal;
        raise = 0.0;
        total = 0.0;
    }
        public String getF_name() {
            return f_name;
        }
        public String getL_name() {
            return l_name;
        }
        public double getSalary() {
            return salary;
        }
        public double getRaise() {
            return raise;
        }
        public double getTotal() {
        return total;
    }
        public void setF_name(String F_name) {
        f_name = F_name;
        }
        public void setL_name(String L_name) {
            l_name = L_name;
        }
        public void setSalary(double Salary) {
            salary = Salary; {
                if (Salary < 0) {
                    salary = 0.0;
                };
            }
            getARaise();
        }

        public void getARaise() {
            raise = (salary * 0.10);
            total  = raise + salary;
        }

        public void employeeInfo() {
            System.out.println("Name: " + f_name + " " + l_name);
            System.out.println("Salary: " + salary);
            System.out.println("Annual Raise " + raise);
            System.out.println("New Salary " + total);
        }
}
