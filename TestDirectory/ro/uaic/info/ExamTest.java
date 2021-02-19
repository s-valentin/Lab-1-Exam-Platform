package ro.uaic.info;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExamTest {

    private Exam exam = new Exam();

    @Test
    public void setTitle(){
        exam.setTitle("Midterm exam");
        assertEquals("Midterm exam", exam.getTitle());
    }

    @Test
    public void setSubject(){
        exam.setSubject("English");
        assertEquals("English", exam.getSubject());
    }

    @Test
    public void setTimeTest() {
        exam.setTime(60);
        assertEquals(60, exam.getTime());
    }

    @Test
    public void setNbQuestionsTest() {
        exam.setNbQuestions(10);
        assertEquals(10, exam.getNbQuestions());
    }

    @Test
    public void setStartPointsTest() {
        exam.setStartPoints(1);
        assertEquals(1, exam.getStartPoints());
    }

    @Test
    public void setTotalPointsTest() {
        exam.setTotalPoints(10);
        assertEquals(10, exam.getTotalPoints());
    }

    @Test
    public void setGrade(){
        exam.setGrade(8);
        assertEquals(8, exam.getGrade());
    }

}