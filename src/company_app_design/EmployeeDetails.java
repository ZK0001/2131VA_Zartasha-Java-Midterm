package company_app_design;

//Creating main class
class EmployeeDetails {

    //main() method start
    public static void main(String[] args) {

        //Create object of EmployeeDetails class
        EmployeeDetails emp = new EmployeeDetails();
        //Set values to the properties
        emp.setEmp_id(101);
        emp.setName("Jim Halpert");
        emp.setDepartment("IT");
        emp.setSalary(15000);
        emp.setAddress("Beverly Hills");
        emp.setEmail("jim@yahoo.com");

        //Show Employee details
        System.out.println(emp);

        //Get salary using getter
        int sal = emp.getSalary();
        int increment = 0;
        //Increment salary based on condition
        if ((sal >= 1000) && (sal <= 1500)) {
            //increment salary 2%
            increment += (sal * 2) / 100;
            sal = sal + increment;

            emp.setSalary(sal);
            System.out.println("\n Salary is incremented \n");
            System.out.println(emp);

        } else if ((sal >= 1500) && (sal <= 20000)) {
            //increment salary 5%
            increment += (sal * 5) / 100;
            sal = sal + increment;

            emp.setSalary(sal);
            System.out.println("\n Salary is incremented \n");
            System.out.println(emp);
        } else {
            System.out.println("\n Salary is not incremented \n");
            System.out.println(emp);
        }
    }


    //Create properties of Employee class

    int emp_id, emp_salary;

    String emp_name, emp_address, emp_department, emp_email;

    //Getter and setters for getting and setting properties

    public int getEmp_id() {

        return emp_id;
    }

    public void setEmp_id(int emp_id) {

        this.emp_id = emp_id;
    }

    public int getSalary() {

        return emp_salary;

    }

    public void setSalary(int emp_salary) {

        this.emp_salary = emp_salary;

    }

    public String getName() {

        return emp_name;

    }

    public void setName(String emp_name) {

        this.emp_name = emp_name;
    }

    public String getAddress() {

        return emp_address;

    }


    public void setAddress(String emp_address) {

        this.emp_address = emp_address;

    }

    public String getDepartment() {

        return emp_department;

    }

    public void setDepartment(String emp_department) {
        this.emp_department = emp_department;
    }

    public String getEmail() {
        return emp_email;
    }

    public void setEmail(String emp_email) {
        this.emp_email = emp_email;

    }

    //Overriding toString() method

    @Override

    public String toString() {

        return " Employee details{ Id = " + emp_id + "\n Salary = " + emp_salary + "\n Name = " + emp_name + "\n Address = " + emp_address + "\n Department = " + emp_department + "\n Email = " + emp_email + "}";
    }

}
