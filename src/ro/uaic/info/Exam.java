package ro.uaic.info;

public class Exam {

    protected int time;
    int nbQuestions;
    int totalPoints;
    int startPoints;
    private Questions [] question;




    public void setTotalPoints(int number){
        totalPoints = number;
    }

    public void setStartPoints(int number){
        startPoints = number;
    }

    public void setNbQuestions(int number) {
        nbQuestions = number;
        question = new Questions[nbQuestions];
    }

    public void setTime(int number) {
        time = number;
    }


}
