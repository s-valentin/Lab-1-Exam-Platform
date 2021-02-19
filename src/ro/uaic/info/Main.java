package ro.uaic.info;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Exam> exams = new ArrayList<>();

        String input;

        int profCount = 0;
        int studCount = 0;

        ArrayList<Professor> profs = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();

        while (true) { // bucla infinita, nu avem de ce sa ne oprim.
            System.out.println("State your identity:");
            input = scanner.next();
            if (input.equals("Professor")) {
                profs.add(new Professor()); // am creat un profesor

                System.out.println("State your name:");
                input = scanner.next();
                profs.get(profCount).setName(input); // am adaugat numele profesorului

                System.out.println("What do you want to do?"); // create / remove
                input = scanner.next();

                if (input.equals("create")) { // ramura create
                    exams.add(profs.get(profCount++).createExam()); //profesorul creeaza un examen
                } else if (input.equals("delete")) { // ramura delete
                    for (Exam exam : exams) {
                        System.out.print(exam.getSubject() + " ");
                    } // printam lista de examene pt ca profesorul sa aleaga ce obiect sterge

                    System.out.println("\nInsert the exam subject from the above list.");
                    input = scanner.next();

                    for (Exam exam : exams) {
                        {
                            if (input.equals(exam.getSubject()))
                                exams.remove(exam); // a selectat din lista de examene obiectul pe care acum il stergem
                            break;
                        }
                    }

                }
            } else if (input.equals("Student")) {
                students.add(new Student()); // am creat un student

                System.out.println("State your name: ");
                input = scanner.next();
                students.get(studCount).setName(input); // am adaugat numele studentului

                System.out.println("Exam List:");

                for (Exam exam : exams) {
                    System.out.print(exam.getSubject() + " ");
                } // printam lista de examene pt ca studentul sa aleaga unul.

                System.out.println("\nInsert the exam subject from the above list.");
                input = scanner.next(); // studentul alege un examen din lista de mai sus

                for (Exam exam : exams) {
                    if (input.equals(exam.getSubject()))
                        students.get(studCount++).startExam(exam);
                    break;
                } // verificam pentru fiecare examen din lista de examene subiectul care se potriveste cu cel introdus de elev

            } else {
                System.out.println("Are you a student or a professor?");
            }
        }
    }

}

