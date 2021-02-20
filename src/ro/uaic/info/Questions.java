package ro.uaic.info;

import java.util.ArrayList;
import java.util.Collections;

public class Questions extends Exam implements Useful {
    String title;
    QuestionType type;
    int nbRightAnswers;
    int nbWrongAnswers;
    int nbAllAnswers;
    int points;
    float pointsTaken;
    ArrayList<String> rightAnswers = new ArrayList<>();
    ArrayList<String> wrongAnswers = new ArrayList<>();
    ArrayList<String> allAnswers = new ArrayList<>();

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

    public void setType(String type) {
        if(type.equals("multiple choice"))
            this.type = QuestionType.multipleChoice;
        if(type.equals("short answer"))
            this.type = QuestionType.shortAnswer;
        if(type.equals("dropdown"))
            this.type = QuestionType.dropdown;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public float getPointsTaken() {
        return pointsTaken;
    }

    /*public String[] getRightAnswers() {
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
    }*/

    public ArrayList<String> getRightAnswers() {
        return rightAnswers;
    }

    public void setRightAnswers(String rightAnswers) {
        this.rightAnswers.add(rightAnswers);
        nbRightAnswers++;
    }

    public ArrayList<String> getWrongAnswers() {
        return wrongAnswers;
    }

    public void setWrongAnswers(String wrongAnswers) {
        this.wrongAnswers.add(wrongAnswers);
        nbWrongAnswers++;
    }

    /*
    functia determina numarul total de raspunsuri gresite + corecte
    amesteca lista cu toate raspunsurile (corecte + gresite)
     */
    public void createAllAnswers() {

        //weird fix
        nbRightAnswers--;
        rightAnswers.remove(0);

        nbAllAnswers = nbWrongAnswers + nbRightAnswers;
        allAnswers.addAll(rightAnswers);
        allAnswers.addAll(wrongAnswers);

        //amestec tabloul folosind metoda de pe acest site
        //https://www.journaldev.com/32661/shuffle-array-java
        Collections.shuffle(allAnswers);


        /*Random rand = new Random();
        print();
        System.out.println("random");
        for (i = 0; i < nbAllAnswers; i++) {
            int randomIndexToSwap = rand.nextInt(allAnswers.length);
            String aux = allAnswers[randomIndexToSwap];
            allAnswers[randomIndexToSwap] = allAnswers[i];
            allAnswers[i] = aux;*/
    }

    //valideaza daca raspunsul dat e de forma multiple choice
    //acfg -> valid
    //aabcd -> invalid
    public int validateInputMC(String input) {
        //ok == 1 -> input valid
        int ok = 1;

        int[] frecventa = new int['z'];
        for (int i = 0; i < input.length(); i++) {
            char litera = input.charAt(i);
            if (litera >= 'a' && litera <= (char) (nbAllAnswers + 'a' - 1))
                frecventa[litera]++;
            else {
                ok = 0;
                break;
            }
        }
        for (int i = 'a'; i <= (char) (nbAllAnswers + 'a' - 1); i++)
            if (frecventa[i] >= 2)
                ok = 0;

        return ok;
    }

    //valideaza daca raspunsul dat e de forma dropdown
    //15 -> valid
    //b -> invalid
    public int validateInputD(String input) {
        //ok == 1 -> input valid
        int ok = 1;

        if (input.length() > 1)
            ok = 0;
        else {
            char cifra = input.charAt(0);
            if (!(cifra >= '0' && cifra <= '9'))
                ok = 0;
        }
        return ok;
    }

    public float checkInputAnswer(String input) {
        float aux;
        switch (type) {
            case multipleChoice: {
                if (validateInputMC(input) == 0)
                    break;
                else {
                    float correct = 0;
                    float wrong = 0;

                    for (int i = 0; i < input.length(); i++) {
                        System.out.println(input.charAt(i) - 'a');
                        int index = input.charAt(i) - 'a';
                        if (rightAnswers.contains(allAnswers.get(index)))
                            correct++;
                        else
                            wrong++;
                    }
                    /*System.out.println("-------");
                    System.out.println(correct);
                    System.out.println(wrong);*/
                    float pointsPerAnswer = points / (float) nbRightAnswers;
                    pointsTaken = (correct * pointsPerAnswer) - (wrong * pointsPerAnswer / 2);
                    //System.out.println("punctaj luat " + pointsTaken);
                }
                break;
            }
            case shortAnswer: {
                if (rightAnswers.contains(input))
                    pointsTaken = points;
                else
                    pointsTaken = 0;
                //System.out.println("punctaj luat " + pointsTaken);
                break;
            }
            case dropdown: {
                int index = input.charAt(0) - 'a';
                if (rightAnswers.contains(allAnswers.get(index)))
                    pointsTaken = points;

                else
                    pointsTaken = 0;
                //System.out.println("punctaj luat " + pointsTaken);
                break;
            }

            default:
                break;
        }
        aux = pointsTaken;
        return aux;
    }


    //printeaza continutul listei cu toate raspunsurile
    @Override
    public void print() {
        for (int i = 0; i < nbAllAnswers; i++)
            System.out.println((char)(i+'a') + ". " + allAnswers.get(i));
    }

    public void printRightAnswers()
    {
        for(int i = 0; i < nbRightAnswers; i++)
            System.out.println(rightAnswers.get(i));
        System.out.println("-----------------------");
    }

    public void printWrongAnswers()
    {
        //for(int i = 0; i < nbWrongAnswers; i++)
            System.out.println(wrongAnswers/*.get(i)*/);
    }
}



