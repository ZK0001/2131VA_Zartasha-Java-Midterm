package company_app_design;

import java.util.ArrayList;

public interface Employee {

    /**
     * INSTRUCTIONS
     * Employee is an Interface which contains multiple unimplemented methods.
     * <p>
     * Read the methods and understand what they might be used for. What could be the requirements behind creating such
     * methods? Think about it, and then implement them in a concrete class.
     * <p>
     * You also need to add some additional methods to meet any additional business requirements of this application
     * <p>
     * Get creative - think like a dev
     */

    int employeeId();

    String employeeName();

    void assignDepartment();

    int calculateSalary();

    void benefits();


    void create_new(ArrayList<Employee> emp);

    int checkInt();

    boolean getName();

    boolean getIdNumber();

    boolean getDepartment();

    boolean getPosition();

    void get_info(ArrayList<Employee> emp);

    void quit(ArrayList<Employee> emp);

    void change_status();

    Double checkDouble();

    void salary_change(Double amount);


}
