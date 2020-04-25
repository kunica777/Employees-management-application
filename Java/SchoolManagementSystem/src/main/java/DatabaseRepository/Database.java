/*package DatabaseRepository;
import Methods.BasicTools;
import Student.Student;

import java.io.*;

public class Database implements BasicTools {
    private Student[] database = new Student[10];
    private File dataFile = new File("C:\\Users\\kseni\\Desktop\\Java\\SchoolManagementSystem\\Databases\\StudentsDatabase");
    private FileWriter fileWriter = new FileWriter(dataFile,true);
    private FileReader fileReader = new FileReader(dataFile);
    private BufferedReader bufferedReader = new BufferedReader(fileReader);
    private BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

    private Database() throws Exception {
    }

    public void addNewStudentToArray(Student student) {
        int i=0;
       //writing student to an array
        for (Student student1 : database) {
           if(student1==null){
               database[i]=student;
               break;
           }i++;
       }
    }
    public void addNewStudentToFile(Student [] student) {
        bufferedWriter.append();
    }

    public Student[] viewStudentById(int id) {
        return database;
    }

    public Student[] viewStudentByName(String firstName) {
        return database;
    }

    public Student[] showDatabase() {
        return database;
    }
} */
