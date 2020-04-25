package service;
import model.Employee;
import model.Gender;
import model.exception.EmployeeNotFoundException;
import repository.EmployeeArrayRepository;

public class EmployeeService {

    private EmployeeArrayRepository employeeArrayRepository = new EmployeeArrayRepository();
    private int employeeCount = 0;

    public void addEmployee(Employee employee){
        employeeCount++;
        employee.setId(employeeCount);
        employeeArrayRepository.addEmployee(employee);
    }

    public void modifyEmployee(){
    }

    public void deleteEmployee(){
    }

    public Employee getEmployeeById(int employeeId) throws EmployeeNotFoundException {
        Employee employee = employeeArrayRepository.getEmployeeById(employeeId);
        if(employee==null){
            throw new EmployeeNotFoundException(employeeId);
        }
        return employee;
    }

    public Employee[] getEmployeesByName(String name) throws EmployeeNotFoundException {
        Employee [] employees = employeeArrayRepository.getEmployeesByName(name);
        if(employees[0]==null){
            throw new EmployeeNotFoundException(name);
        }
        return employees;
    }

    public Employee [] getEmployees(){
        return employeeArrayRepository.getEmployees();
    }

    public Employee[] getEmployeesByGender(Gender gender){
        return employeeArrayRepository.getEmployeesByGender(gender);
    }
}
