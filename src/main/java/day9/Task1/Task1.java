package day9.Task1;

public class Task1 {
    public static void main(String[] args) {

        Student student1 = new Student("Tomas", "natural Sciences");
        Teacher teacher1 = new Teacher("Nick", "chemistry");

        System.out.println("Учебная группа " + student1.getGroupName() + ", Предмет " + teacher1.getSubjectName());

        student1.printInfo();
        teacher1.printInfo();


    }
}
