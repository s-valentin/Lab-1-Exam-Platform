package ro.uaic.info;

public class Exam {

    private int time;
    private int nbQuestions;
    private int totalPoints;
    private int startPoints;
    protected int grade;
    private String subject;
    private Questions[] question;

    public void setSubject(String string){
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

    public String getSubject(){
        return subject;
    }
}
