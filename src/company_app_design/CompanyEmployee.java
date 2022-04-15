package company_app_design;

public class CompanyEmployee {

    /** INSTRUCTIONS
     *  This class has a main method where you will be able to create instances of the EmployeeInfo class in order
     *  to use attributes and methods.
     *
     *  Demonstrate as many methods as possible here. Feel free to show off what you've learned so far.
     *
     *  The goal of this application is to provide basic employee information services
     *  Try to think like a Software Developer
     */
    public static void main(String[] args) {

        EmployeeInfo e1 = new EmployeeInfo("Michael Scott", 100, "VP", "mscott@dundermifflin.com", "Sales", 250_000)

        {

            public int getNumberOfEmployees() {
                return 25000;
            }

            @Override
            public int employeeId() {
                return 100;
            }



            @Override
            public int NumberOfEmployees() {
                return 15000;
            }

            @Override
            public String assignName(String employeeName) {
                return employeeName();
            }
            @Override
            public String assignDepartment(String department) {
                return department;
            }

            @Override
            public void benefits() {

            }

            @Override
            public int calculateSalary() {
                return 250000;
            }

            @Override
            public boolean hasPTO() {
                return false;
            }

            @Override
            public void isFullTime(boolean isFullTime) {

            }

        };

        System.out.println("Emp Name:" + e1.employeeName());
        System.out.println("Emp ID: " + e1.employeeId());
        System.out.println("Emp Dept:" + e1.getDepartment());
        System.out.println("Emp email: " + e1.getEmail());
        System.out.println("Emp Salary: " + e1.calculateSalary());


        e1.assignDepartment("Sales");
        e1.assignName("Justin");
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


