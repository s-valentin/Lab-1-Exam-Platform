package ro.uaic.info;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class QuestionsTest {

    private Questions testQuestion = new Questions();

    @Test
    void setTitle() {
        testQuestion.setTitle("Question123");
        assertEquals("Question123", testQuestion.getTitle());
    }

    @Test
    void setType() {
        testQuestion.setType(QuestionType.shortAnswer);
        assertEquals(QuestionType.shortAnswer, testQuestion.getType());
    }

    /*@Test
    void setNbAnswers() {
        testQuestion.setNbAnswers(3);
        assertEquals(3, testQuestion.getNbAnswers());
    }*/

    @Test
    void setPoints() {
        testQuestion.setPoints(8);
        assertEquals(8, testQuestion.getPoints());
    }

    @Test
    void setRightAnswers() {
        testQuestion.setRightAnswers("caine");
        testQuestion.setRightAnswers("pisica");
        testQuestion.setRightAnswers("pasare");
        assertEquals("caine",testQuestion.rightAnswers.get(0));
        assertEquals("pisica",testQuestion.rightAnswers.get(1));
        assertEquals("pasare",testQuestion.rightAnswers.get(2));
    }

    @Test
    void setWrongAnswers() {
        testQuestion.setWrongAnswers("caine");
        testQuestion.setWrongAnswers("pisica");
        testQuestion.setWrongAnswers("pasare");
        assertEquals("caine",testQuestion.wrongAnswers.get(0));
        assertEquals("pisica",testQuestion.wrongAnswers.get(1));
        assertEquals("pasare",testQuestion.wrongAnswers.get(2));
    }

    @Test
    void validateInputMC() {
        testQuestion.setRightAnswers("a");
        testQuestion.setRightAnswers("b");
        testQuestion.setRightAnswers("c");
        testQuestion.setWrongAnswers("d");
        testQuestion.setWrongAnswers("e");
        testQuestion.setWrongAnswers("f");
        testQuestion.createAllAnswers();
        //System.out.println(testQuestion.nbAllAnswers + 'a');
        //System.out.println(testQuestion.nbAllAnswers);
        assertEquals(0, testQuestion.validateInputMC("acfg"));
        assertEquals(0,testQuestion.validateInputMC("aabc"));
        assertEquals(1, testQuestion.validateInputMC("acf"));
    }

    /*@Test
    void createAllAnswers() {
    }*/
}