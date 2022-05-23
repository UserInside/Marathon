package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(Student student) {
        Random rand  = new Random();
        String literalValue = "оценка";
        switch (rand.nextInt(3) +2) {
            case 2 :
                literalValue = "неудовлетворительно";
                break;
            case 3 :
                literalValue = "удовлетворительно";
                break;
            case 4 :
                literalValue = "хорошо";
                break;
            default:
                literalValue = "отлично";
                break;
        }
        System.out.println("Преподаватель " + this.name + " оценил студента с именем " + student.getName() +
                " по предмету " + this.subject + " на оценку " + literalValue);
    }
}
