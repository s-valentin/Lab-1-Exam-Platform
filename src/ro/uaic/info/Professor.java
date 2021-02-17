package ro.uaic.info;

import java.util.Scanner;

public class Professor {

    protected Exam[] exams = new Exam[10];
    protected int counter = 0;


    public void createExam(){
        exams[counter] = new Exam();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert subject name: ");
        exams[counter].setSubject(scanner.next());
        System.out.println(exams[counter].getSubject());

        System.out.println("Insert exam title: ");
        exams[counter].setTitle(scanner.next());

        System.out.println("Insert the time for the test: ");
        exams[counter].setTime(scanner.nextInt());

        System.out.println("Insert the number of questions: ");
        exams[counter].setNbQuestions(scanner.nextInt());

        System.out.println("Insert the starting points: ");
        exams[counter].setStartPoints(scanner.nextInt());

        System.out.println("Insert the total number of points: ");
        exams[counter++].setTotalPoints(scanner.nextInt());
    }

}
