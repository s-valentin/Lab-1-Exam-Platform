package ro.uaic.info;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExamTest {

        private Exam exam = new Exam();

        @Test
        public void setTimeTest() {
            exam.setTime(10);
            assertEquals(10, exam.time);
        }

}