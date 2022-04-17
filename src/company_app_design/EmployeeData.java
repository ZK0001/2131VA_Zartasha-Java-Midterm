package company_app_design;

public abstract class EmployeeData {
    public abstract int employeeId();

    public abstract String employeeName();

    public abstract String assignDepartment(String department);

    public abstract void benefits();

    public abstract int calculateSalary();

    public abstract boolean hasPTO();

    public abstract void isFullTime(boolean isFullTime);

    public abstract int getNumberOfEmployees();

    public abstract int setEmp_id();

    public abstract String setName();

    public abstract void setDepartment();

    public abstract int setSalary();

    public abstract String setAddress();

    public abstract String setEmail();

    public abstract int getSalary();
}




