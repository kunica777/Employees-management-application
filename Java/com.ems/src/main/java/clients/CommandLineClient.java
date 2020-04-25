package clients;

import model.Employee;
import model.Gender;
import model.exception.EmployeeNotFoundException;
import service.EmployeeService;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CommandLineClient {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeService employeeService = new EmployeeService();

        do {
            System.out.println("Select 0 to exit");
            System.out.println("Select 1 to add employee");
            System.out.println("Select 2 to modify employee");
            System.out.println("Select 3 to remove employee");
            System.out.println("Select 4 to view all employees");
            System.out.println("Select 5 to view  employee by id");
            System.out.println("Select 6 to view employee by name");
            System.out.println("Select 7 to view employees by gender");


            try {
                int selectedOption = sc.nextInt();
                switch (selectedOption) {
                    case 0:
                        System.out.println("Goodbye");
                        return;
                    case 1:
                        System.out.print("Enter first name:");
                        String firstName = sc.next();
                        System.out.print("Enter last name: ");
                        String lastName = sc.next();
                        System.out.print("Enter age: ");
                        int age = sc.nextInt();
                        System.out.print("Enter gender: ");
                        Gender gender = Gender.valueOf(sc.next().toUpperCase());
                        System.out.print("Enter department: ");
                        sc.nextLine(); //read empty line (remove enter from previous input)
                        String department = sc.nextLine();
                        System.out.print("Enter salary: ");
                        BigDecimal salary = sc.nextBigDecimal();
                        Employee employee = new Employee(firstName, lastName, age, gender, department, salary);
                        employeeService.addEmployee(employee);
                        break;
                    case 2:
                        employeeService.modifyEmployee();
                        break;
                    case 3:
                        employeeService.deleteEmployee();
                        break;
                    case 4:
                        Employee[] employees = employeeService.getEmployees();
                        printHeader();
                        printEmployees(employees);
                        break;
                    case 5:
                        System.out.print("Enter employee ID: ");
                        int id = sc.nextInt();
                        employee = employeeService.getEmployeeById(id);
                        if (employee != null) {
                            System.out.println(employee);
                        }
                        break;
                    case 6:
                        System.out.print("Enter employee name: ");
                        String name = sc.next();
                        employees = employeeService.getEmployeesByName(name);
                        printEmployees(employees);
                        break;
                    case 7:
                        System.out.println("Enter gender to view employees:");
                        gender = Gender.valueOf(sc.next().toUpperCase());
                        employees = employeeService.getEmployeesByGender(gender);
                        printEmployees(employees);
                    default:
                        System.out.println("Invalid option");
                        break;
                }
            }catch (InputMismatchException ex) {
                System.out.println("Illegal age or salary  or option format");
                sc.nextLine();
            }catch (IllegalArgumentException ex) {
                System.out.println("Illegal gender. Possible values are: " +Arrays.toString(Gender.values()));
            } catch (EmployeeNotFoundException ex) {
                System.out.println(ex.getMessage());
            }
        } while (true) ;
    }
            //challenge for home: improve method to search employees by first characters of the name

            //methods to print information
            private static void printEmployees (Employee[]employees){
                printHeader();
                for (Employee employee : employees) {
                    if (employee != null) {
                        printEmployee(employee);
                    }
                }
            }
            private static void printHeader () {
                System.out.printf("%-10s | %-20s | %-20s | %-5s | %-10s | %-20s | %-20s  \n",
                        "ID", "First Name", "Last Name", "Age", "Gender", "Department", "Salary");
            }
            private static void printEmployee (Employee employee){
                System.out.printf("%-10s | ", employee.getId());
                System.out.printf("%-20s | ", employee.getFirstName());
                System.out.printf("%-20s | ", employee.getLastName());
                System.out.printf("%-5s | ", employee.getAge());
                System.out.printf("%-10s | ", employee.getGender());
                System.out.printf("%-20s | ", employee.getDepartment());
                System.out.printf("%-20s\n", employee.getSalary());
            }


        }
