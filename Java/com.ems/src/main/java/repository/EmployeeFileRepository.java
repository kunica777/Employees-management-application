package repository;

import model.Employee;
import model.Gender;

public class EmployeeFileRepository implements EmployeeRepository {

    @Override
    public void addEmployee(Employee employee) {

    }

    @Override
    public void modifyEmployee() {

    }

    @Override
    public void deleteEmployee() {

    }

    @Override
    public Employee getEmployeeById(int employeeId) {
        return null;
    }

    @Override
    public Employee[] getEmployeesByName(String employeeName) {
        return new Employee[0];
    }

    @Override
    public Employee[] getEmployees() {
        return new Employee[0];
    }

    @Override
    public Employee[] getEmployeesByGender(Gender gender) {
        return new Employee[0];
    }
}
