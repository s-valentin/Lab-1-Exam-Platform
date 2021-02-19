package ro.uaic.info;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    private Professor prof = new Professor();
    private Exam exam = new Exam();

/*    @Test
    void createExamTest() {
        InputStream sysInBackup = System.in; // dau backup la system.in
        ByteArrayInputStream in = new ByteArrayInputStream("OOP titlu 60 9 1 10".getBytes());
        System.setIn(in); // setez system.in-ul pe inputul de mai sus
        exam = prof.createExam(); // apelez functia createExam si salvez in exam.
        assertEquals("OOP", exam.getSubject()); // teste pt fiecare camp
        assertEquals("titlu", exam.getTitle());
        assertEquals(60, exam.getTime());
        assertEquals(9, exam.getNbQuestions());
        assertEquals(1, exam.getStartPoints());
        assertEquals(10, exam.getTotalPoints());
        System.setIn(sysInBackup); // resetez system.in la original.
    }*/

    @Test
    void setNameTest(){
        prof.setName("Emanuel Ionut");
        assertEquals("Emanuel Ionut", prof.getName());
    }
}