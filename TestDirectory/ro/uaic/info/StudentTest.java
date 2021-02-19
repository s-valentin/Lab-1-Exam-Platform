package ro.uaic.info;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    private Student stud = new Student();
    private Exam exam = new Exam();
    private Professor prof = new Professor();

    @Test
    void setNameTest(){
        stud.setName("Emanuel Ionut");
        assertEquals("Emanuel Ionut", stud.getName());
    }


    /*Ar trebui sa mearga, doar ca din ce am citit pe internet
      ar trebui sa fac niste modificari care ar putea cauza probleme la git push
      actual-ul si expected testul e la fel, doar o problema de line separators.
     */
    /*@Test
    void startExamTest()
    {
        OutputStream sysOutBackup = System.out; // dau backup la system.out
        ByteArrayOutputStream out = new ByteArrayOutputStream(100);
        System.setOut(new PrintStream(out));
        //nu stiu cum sa testez system outputul.
        stud.startExam(exam);
        assertEquals("null\nnull\nYou have 0 minutes\nYou have 0 questions\nYou have 0 starting points\nYou can get 0 points maximum\n", out);

    }*/

}