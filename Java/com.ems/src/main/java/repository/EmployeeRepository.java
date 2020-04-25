package repository;
import model.Employee;
import model.Gender;

public interface EmployeeRepository{
    void addEmployee(Employee employee);

    void modifyEmployee();

    void deleteEmployee();

    Employee getEmployeeById(int employeeId);

    Employee [] getEmployeesByName(String employeeName);

    Employee[] getEmployees();

    Employee[] getEmployeesByGender(Gender gender);
}
