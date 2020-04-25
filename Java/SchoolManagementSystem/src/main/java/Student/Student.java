package Student;
import Constants.Gender;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private Gender gender;
    private int id;

    public Student (String firstName, String lastName, int age, Gender gender){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.gender=gender;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public Gender getGender(){
        return gender;
    }

    public int getId(){
        return id;
    }
}
