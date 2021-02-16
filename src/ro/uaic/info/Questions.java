package ro.uaic.info;



public class Questions extends Exam {
    String title;
    QuestionType type;
    int nbAnswers;
    int points;
    int pointsTaken;
    String []rightAnswers = new String[10];
    String wrongAnswers;
    String allAnswers;

    public Questions() {
        this.nbAnswers = 0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public QuestionType getType() {
        return type;
    }

    public void setType(QuestionType type) {
        this.type = type;
    }

    public int getNbAnswers() {
        return nbAnswers;
    }

    public void setNbAnswers(int nbQuestions) {
        this.nbAnswers = nbQuestions;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getPointsTaken() {
        return pointsTaken;
    }

    public String[] getRightAnswers() {
        return rightAnswers;
    }

    public void setRightAnswers(String rAnswer) {
        rightAnswers[nbAnswers++] = rAnswer;
    }
}
