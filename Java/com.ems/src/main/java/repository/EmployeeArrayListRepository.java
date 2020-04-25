package repository;

import model.Employee;
import model.Gender;

import java.util.ArrayList;
import java.util.List;

public class EmployeeArrayListRepository implements EmployeeRepository {

    private List<Employee> employeeDatabase = new ArrayList<>();

    @Override
    public void addEmployee(Employee employee) {
        employeeDatabase.add(employee);
    }

    @Override
    public void modifyEmployee() {

    }

    @Override
    public void deleteEmployee() {

    }

    @Override
    public Employee getEmployeeById(int employeeId) {
        for (int i = 0; i < employeeDatabase.size(); i++) {
            Employee employee = employeeDatabase.get(i);
            if(employee.getId() == employeeId){
                return employee;
            }
        }

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
