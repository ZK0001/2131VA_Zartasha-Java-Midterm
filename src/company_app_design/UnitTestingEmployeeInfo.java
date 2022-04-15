package company_app_design;

public class UnitTestingEmployeeInfo {

    /**
     * Use this class to write unit tests for all user-defined methods that you have implemented in this package.
     */

    public static void main(String[] args) {

        EmployeeInfo e1 = new EmployeeInfo("Justin", 250, "CEO", "JB@google.com", "Marketing", 150000)
        {

            @Override
            public int NumberOfEmployees() {
                return 25;
            }

            @Override
            public String assignName(String employeeName) {
                return employeeName();
            }


            @Override
            public int employeeId() {
                return 250;
            }

            @Override
            public String assignDepartment(String department) {
                return null;
            }

            @Override
            public void benefits() {

            }

            @Override
            public int calculateSalary() {
                return 25000;
            }

            @Override
            public boolean hasPTO() {
                return false;
            }

            @Override
            public void isFullTime(boolean isFullTime) {

            }

            @Override
            public int getNumberOfEmployees() {
                return 250;
            }


        };


        System.out.println("Emp Name:" + e1.employeeName());
        System.out.println("Emp ID: " + e1.employeeId());
        System.out.println("Emp Dept:" + e1.getDepartment());
        System.out.println("Emp email: " + e1.getEmail());
        System.out.println("Emp Salary: " + e1.calculateSalary());


        e1.assignDepartment("Sales");

        System.out.println("new department: " + e1.getDepartment());

        System.out.printf("Number of employees: %s%n", e1.getNumberOfEmployees());
        System.out.println();
        e1.hasPTO(false);
        System.out.println("This employee has no PTO and only sick leave");
        e1.benefits();
        System.out.println();
        e1.hasPTO(true);
        System.out.println("This employee can take up to 4 weeks PTO");
        e1.benefits();
        System.out.println();

    }}

