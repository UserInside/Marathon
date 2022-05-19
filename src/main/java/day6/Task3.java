package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Иоан Петрович", "химия");
        Student student = new Student("Алексей");

        teacher.evaluate(student);
    }
}
