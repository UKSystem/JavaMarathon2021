package day6;

public class Task3 {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Mark Smith", "chemistry");
        Student student = new Student("Alice");

        teacher.evaluate(student.getName());

    }
}
