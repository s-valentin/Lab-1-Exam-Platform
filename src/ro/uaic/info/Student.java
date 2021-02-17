package ro.uaic.info;

public class Student extends Professor{

    public void chooseExam(String string) {
        System.out.println(exams[0].getSubject());
        for(int i = 0; i < counter; i++){
            if(exams[i].getSubject().equals(string)) {
                startExam(i);
                break;
            }
            if(i > counter)
                System.out.println("You don't have that exam.");
        }
    }

    private void startExam(int index){
        System.out.println(exams[index].getTitle());
        System.out.println(exams[index].getSubject());
        System.out.println("You have " + exams[index].getTime() + " minutes");
        System.out.println("You have " + exams[index].getNbQuestions() + "questions");
        System.out.println("You have " + exams[index].getStartPoints() + "starting points");
        System.out.println("You can get " + exams[index].getTotalPoints() + "points maximum");
    }



}
