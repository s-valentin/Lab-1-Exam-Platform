package ro.uaic.info;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam {

    private String subject;
    private String title;
    private int time;
    private int nbQuestions;
    private int startPoints;
    private int totalPoints;
    protected int grade;
    private Questions[] question;
    ArrayList<Questions> questions = new ArrayList<>();

    public void setTitle(String string) {
        title = string;
    }

    public void setSubject(String string) {
        subject = string;
    }

    public void setTime(int number) {
        time = number;
    }

    public void setNbQuestions(int number) {
        nbQuestions = number;
        question = new Questions[nbQuestions];
    }

    public void setStartPoints(int number) {
        startPoints = number;
    }

    public void setTotalPoints(int number) {
        totalPoints = number;
    }

    public void setGrade(int number) {
        grade = number;
    }

    public String getTitle() {
        return title;
    }

    public String getSubject() {
        return subject;
    }

    public int getTime() {
        return time;
    }

    public int getNbQuestions() {
        return nbQuestions;
    }

    public int getStartPoints() {
        return startPoints;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public int getGrade() {
        return grade;
    }

    public void setQuestions() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < getNbQuestions(); i++) {
            Questions intrebare = new Questions();

            System.out.println("Insert question:");
            intrebare.setTitle(scanner.nextLine());
            System.out.println("Insert question type:");
            System.out.println("multiple choice/short answer/dropdown");
            intrebare.setType(scanner.nextLine());
            System.out.println("Number of points for this question:");
            intrebare.setPoints(scanner.nextInt());

            switch (intrebare.getType()) {
                case multipleChoice: {
                    System.out.println("Insert right answers:");
                    System.out.println("Finish with 0");

                    String input = scanner.nextLine();
                    while (!input.equals("0")) {
                        intrebare.setRightAnswers(input);
                        input = scanner.nextLine();
                    }

                    System.out.println("Insert wrong answers:");
                    System.out.println("Finish with 0");

                    input = scanner.nextLine();
                    while (!input.equals("0")) {
                        intrebare.setWrongAnswers(input);
                        input = scanner.nextLine();
                    }

                    intrebare.createAllAnswers();
                    break;
                }
                case dropdown: {
                    System.out.println("Insert right answer:");
                    scanner.nextLine();
                    String input = scanner.nextLine();
                    intrebare.setRightAnswers(input);


                    System.out.println("Insert wrong answers:");
                    System.out.println("Finish with 0");

                    input = scanner.nextLine();
                    while (!input.equals("0")) {
                        intrebare.setWrongAnswers(input);
                        input = scanner.nextLine();
                    }

                    intrebare.createAllAnswers();
                    break;
                }
                case shortAnswer: {
                    scanner.nextLine();
                    System.out.println("Insert right answer:");
                    String input = scanner.nextLine();
                    intrebare.setRightAnswers(input);
                    break;
                }
                default:
                    break;
            }


            /*System.out.println("test");
            intrebare.print();
            System.out.println(intrebare.nbRightAnswers);
            System.out.println(intrebare.nbWrongAnswers);
            System.out.println("test");*/
            questions.add(intrebare);
        }
    }
}
