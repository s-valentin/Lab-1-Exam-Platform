package ro.uaic.info;


public class Questions extends Exam implements Useful {
    String title;
    QuestionType type;
    int nbRightAnswers;
    int nbWrongAnswers;
    int nbAllAnswers;
    int points;
    int pointsTaken;
    String[] rightAnswers = new String[10];
    String[] wrongAnswers = new String[10];
    String[] allAnswers = new String[20];

    public Questions() {
        this.nbRightAnswers = 0;
        this.nbWrongAnswers = 0;
        this.nbAllAnswers = 0;
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
        rightAnswers[nbRightAnswers++] = rAnswer;
    }

    public String[] getWrongAnswers() {
        return wrongAnswers;
    }

    public void setWrongAnswers(String wAnswer) {
        wrongAnswers[nbWrongAnswers++] = wAnswer;
    }

    public void createAllAnswers()
    {
        int i,j;
        nbAllAnswers = nbWrongAnswers + nbRightAnswers;
        for(i = 0; i < nbRightAnswers; i++)
        {
            allAnswers[i] = rightAnswers[i];
        }
        for(j = i; j < nbAllAnswers; j++)
        {
            allAnswers[j] = wrongAnswers[j-i];
        }
    }

    @Override
    public void print() {
        for (int i = 0; i < nbAllAnswers; i++)
            System.out.println(allAnswers[i]);
    }
}

