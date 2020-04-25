package repository;
import model.Employee;
import model.Gender;

public class EmployeeArrayRepository implements EmployeeRepository{

    //create array of employees classes
    private Employee[] employeeDatabase =  new Employee[5];
    private int currentPosition = 0;

    public void addEmployee(Employee employee){
        employeeDatabase[currentPosition] = employee;
        currentPosition++;

    }
    @Override
    public void modifyEmployee(){}
    @Override
    public void deleteEmployee(){

    }

    @Override
    public Employee getEmployeeById(int employeeId){
        for (Employee employee: employeeDatabase){
            if (employee != null && employee.getId()==employeeId) {
                return employee;
            }
        }return null;
    }

    @Override
    public Employee [] getEmployeesByName(String employeeName){
        Employee[] employees = new Employee[5];
        int i =0;
        for(Employee employee: employeeDatabase) {
            if (employee != null && (employeeName.equalsIgnoreCase(employee.getFirstName())
                    ||employeeName.equalsIgnoreCase(employee.getLastName()))){
                employees[i] = employee;
                i++;
            }
        }return employees;
    }

    @Override
    public Employee[] getEmployees(){
        //creating a copy of our database
        Employee[] employees = new Employee[5];
        for(int i=0; i< employeeDatabase.length; i++){
            employees[i] = employeeDatabase[i];
        }
        return employees;
    }

    @Override
    public Employee[] getEmployeesByGender(Gender gender){
        Employee [] employees = new Employee[5];
        for (int i = 0; i < employeeDatabase.length; i++) {
            if(employeeDatabase[i]!=null){
                employees[i] = employeeDatabase[i];
            }
        }return employees;
    }
}
