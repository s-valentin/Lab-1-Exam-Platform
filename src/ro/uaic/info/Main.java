package ro.uaic.info;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Questions question = new Questions();

        question.setTitle("Alabama");
        question.setType(QuestionType.dropdown);
        question.setPoints(10);

        System.out.println(question.getTitle());

        String raspuns = "";
        System.out.println("Introduceti ");
        Scanner scanner = new Scanner(System.in);
        raspuns = scanner.next();
        while(!raspuns.equals("0"))
        {
            question.setRightAnswers(raspuns);
            raspuns = scanner.next();
        }

        System.out.println(question.nbAllAnswers);

        question.print();

        /*
        Scanner scanner = new Scanner(System.in);
        String test = scanner.next();
        System.out.println(test);
        test = scanner.next();
        System.out.println(test);
        test = scanner.next();
        System.out.println(test);

        System.out.println("State your identity:");
        String input = scanner.next();

        for (int i = 0; i < 2; i++) {
            if (input.equals("Professor")) {
                System.out.println(input);
                break;
            } else if (input.equals("Student")) {
                System.out.println(input);
                break;
            } else if (i == 0) {
                System.out.println("Are you a student or a professor?");
                input = scanner.next();
            } else if (i == 1) {
                System.out.println("Bye bye!");
            }
        }
        */

    }
}
