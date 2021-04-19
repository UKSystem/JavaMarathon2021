package day6;

import java.util.Random;

public class Teacher {

    private String name;            // Имя
    private String subject;         // Предмет

    private String[] scoreName = {"неудовлетворительно", "удовлетворительно", "хорошо", "отлично"};

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(String name){
        int score, shift = 2;
        Random random = new Random();
        score = random.nextInt(4) + shift;

        System.out.println("Преподаватель " + this.name + " оценил студента с именем " + name + " по предмету " + this.subject + " на оценку " + this.scoreName[score - shift]);
    }
}
