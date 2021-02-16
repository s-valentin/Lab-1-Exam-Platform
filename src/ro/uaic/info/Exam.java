package ro.uaic.info;

public class Exam {
    protected int time;
    int nbQuestions;
    private Questions [] question;

    public void setNbQuestions(int number) {
        nbQuestions = number;
        question = new Questions[nbQuestions];
    }

    public void setTime(int number) {
        time = number;
    }





}
