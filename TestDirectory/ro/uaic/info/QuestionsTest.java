package ro.uaic.info;

import org.junit.jupiter.api.Test;

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

    @Test
    void setNbAnswers() {
        testQuestion.setNbAnswers(3);
        assertEquals(3, testQuestion.getNbAnswers());
    }

    @Test
    void setPoints() {
        testQuestion.setPoints(8);
        assertEquals(8, testQuestion.getPoints());
    }
}