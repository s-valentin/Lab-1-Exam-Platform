package ro.uaic.info;

import java.util.Scanner;

public class Student implements Users {

    private String name;
    float punctaje[] = new float[200];

    public void startExam(Exam exam) {
        System.out.println(exam.getTitle());

        System.out.println(exam.getSubject());

        System.out.println("You have " + exam.getTime() + " minutes");

        System.out.println("You have " + exam.getNbQuestions() + " questions");

        System.out.println("You have " + exam.getStartPoints() + " starting points");

        System.out.println("You can get " + exam.getTotalPoints() + " points maximum");

        Scanner scanner = new Scanner(System.in);
        String input = new String();
        for (int i = 0; i < exam.getNbQuestions(); i++) {
            System.out.println("Question nb. " + (i + 1) + " " + exam.questions.get(i).getTitle());
            exam.questions.get(i).print();
            System.out.println("Your Answer:");
            input = scanner.nextLine();
            punctaje[i] = exam.questions.get(i).checkInputAnswer(input);

        }
        System.out.println("You finished the exam");
        float sum = 0;
        for (int i = 0; i < exam.getNbQuestions(); i++)
            sum = sum + punctaje[i];
        System.out.println("Your grade is: " + sum);

        for (int i = 0; i < exam.getNbQuestions(); i++)
            System.out.println("Question nb." + (i + 1) + " points taken: " + punctaje[i]);

        System.out.println("Right answers for every question");
        for (int i = 0; i < exam.getNbQuestions(); i++) {
            System.out.println((i + 1) + ".");
            exam.questions.get(i).printRightAnswers();
        }


    }

    public void setName(String string) {
        name = string;
    }

    public String getName() {
        return name;
    }


}
