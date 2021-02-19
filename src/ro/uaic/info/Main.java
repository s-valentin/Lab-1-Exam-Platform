package ro.uaic.info;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Questions question = new Questions();

        question.setTitle("Alabama");
        question.setType(QuestionType.shortAnswer);
        question.setPoints(6);

        System.out.println(question.getTitle());

        String raspuns = "";
        System.out.println("Introduceti raspunsurile corecte \nLa final puneti 0");
        Scanner scanner = new Scanner(System.in);
        raspuns = scanner.next();
        while(!raspuns.equals("0"))
        {
            question.setRightAnswers(raspuns);
            raspuns = scanner.next();
        }

        System.out.println("Introduceti raspunsurile gresite \nLa final puneti 0");
        raspuns = scanner.next();
        while(!raspuns.equals("0"))
        {
            question.setWrongAnswers(raspuns);
            raspuns = scanner.next();
        }

        question.createAllAnswers();
        System.out.println(question.nbAllAnswers);

        question.print();

        System.out.println("Verificare raspunsuri");
        raspuns = scanner.next();
        question.checkInputAnswer(raspuns);


    }
}
