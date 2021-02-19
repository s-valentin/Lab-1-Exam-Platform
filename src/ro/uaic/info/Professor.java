package ro.uaic.info;

import java.util.Scanner;

public class Professor implements Users {

    private Exam exam;
    private String name;

    public Exam createExam(){
        exam = new Exam();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert subject name: ");
        exam.setSubject(scanner.next());

        System.out.println("Insert exam title: ");
        exam.setTitle(scanner.next());

        System.out.println("Insert the time for the test: ");
        exam.setTime(scanner.nextInt());

        System.out.println("Insert the number of questions: ");
        exam.setNbQuestions(scanner.nextInt());

        System.out.println("Insert the starting points: ");
        exam.setStartPoints(scanner.nextInt());

        System.out.println("Insert the total number of points: ");
        exam.setTotalPoints(scanner.nextInt());

        return exam;
    }

    public void setName(String string) {
        name = string;
    }

    public String getName() {
        return name;
    }






}
