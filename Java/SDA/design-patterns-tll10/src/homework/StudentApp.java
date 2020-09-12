package homework;

public class StudentApp {
    public static void main(String[] args) {
        Student st1 = new Student.Builder()
                .firstName("Jack")
                .lastName("Thomson")
                .age(23)
                .build();


        Student st2 = new Student.Builder()
                .firstName("Molly")
                .lastName("Clarks")
                .build();
    }
}
