package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Иван", "группа 12");
        Teacher teacher = new Teacher("Петрович", "Алгебра");

        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());

        student.printInfo();
        teacher.printInfo();

    }
}


