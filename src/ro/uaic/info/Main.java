package ro.uaic.info;

public class Main {

    public static void main(String[] args) {
        System.out.println("testpushvali");
        System.out.println("testpushcosmin");

        Questions question = new Questions();

        question.setTitle("Alabama");
        question.setNbAnswers(5);
        question.setType(QuestionType.dropdown);
        question.setPoints(10);

        System.out.println(question.getTitle());

        question.setRightAnswers("dog");

        System.out.println(question.nbAnswers);
    }
}
