package ro.uaic.info;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*Questions question = new Questions();

        question.setTitle("Alabama");
        question.setNbAnswers(5);
        question.setType(QuestionType.dropdown);
        question.setPoints(10);

        System.out.println(question.getTitle());

        question.setRightAnswers("dog");

        System.out.println(question.nbAnswers);
         */


        Scanner scanner = new Scanner(System.in);
        /*String test = scanner.next();
        System.out.println(test);
        test = scanner.next();
        System.out.println(test);
        test = scanner.next();
        System.out.println(test);
        */
        String input;

        int profCount = 0;
        int studCount = 0;

        Professor[] profs = new Professor[10];
        Student[] students = new Student[10];

        while (true) {
            System.out.println("State your identity:");
            input = scanner.next();
            for (int i = 0; i < 2; i++) {
                if (input.equals("Professor")) {
                    profs[profCount] = new Professor();
                    profs[profCount++].createExam();
                    break;
                } else if (input.equals("Student")) {
                    System.out.println(input);
                    students[studCount] = new Student();
                    students[studCount++].chooseExam("OOP");
                    break;
                } else if (i == 0) {
                    System.out.println("Are you a student or a professor?");
                    input = scanner.next();
                } else if (i == 1) {
                    System.out.println("Bye bye!");
                }
            }
        }

    }
}
