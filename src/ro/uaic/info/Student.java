package ro.uaic.info;

public class Student implements Users{

    private String name;

    public void startExam(Exam exam){
        System.out.println(exam.getTitle());

        System.out.println(exam.getSubject());

        System.out.println("You have " + exam.getTime() + " minutes");

        System.out.println("You have " + exam.getNbQuestions() + " questions");

        System.out.println("You have " + exam.getStartPoints() + " starting points");

        System.out.println("You can get " + exam.getTotalPoints() + " points maximum");
    }

    public void setName(String string) {
        name = string;
    }

    public String getName() {
        return name;
    }


}
