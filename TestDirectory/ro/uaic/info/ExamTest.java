package ro.uaic.info;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExamTest {

        private Exam exam = new Exam();

        @Test
        public void setNbQuestionsTest(){
            exam.setNbQuestions(10);
            assertEquals(10, exam.nbQuestions);
        }

        @Test
        public void setTimeTest() {
            exam.setTime(60);
            assertEquals(60, exam.time);
        }

        @Test
        public void setTotalPointsTest() {
            exam.setTotalPoints(10);
            assertEquals(10, exam.totalPoints);
        }

        @Test
        public void setStartPointsTest() {
            exam.setStartPoints(1);
            assertEquals(1, exam.startPoints);
        }

}