package model;
import java.math.BigDecimal;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private Gender gender;
    private String department;
    private BigDecimal salary;

    public Employee(String firstName, String lastName, int age, Gender gender, String department, BigDecimal salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.salary = salary;
    }
    @Override
    public String toString(){
        return
        "\nid: "+ id+
        "\nfirst name: "+ firstName+
        "\nlast name: "+ lastName+
        "\nage: "+ age+
        "\ngender: "+ gender+
        "\ndepartment: "+ department+
        "\nsalary:  "+ salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public String getDepartment() {
        return department;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setId(int id) {
        if (this.id==0){
        this.id = id;}
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
