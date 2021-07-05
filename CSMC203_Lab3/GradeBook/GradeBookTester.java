import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

class GradeBookTester {
    private GradeBook myFirstGrade;
    private GradeBook mySecondGrade;

    @BeforeEach
    void setUp() throws Exception {
        myFirstGrade = new GradeBook(95);
        mySecondGrade = new GradeBook(85);
    }

    @AfterEach
    void tearDown() throws Exception {
        myFirstGrade = null;
        mySecondGrade = null;
    }

    @Test
    void testAddScore() {
        fail("Not yet implemented");
        int[] scores = { 100, 85, 66, 77, 90 };
        String gradeOne = myFirstGrade.toString();
        String gradeTwo = mySecondGrade.toString();
        mySecondGrade.toString();

        for (int i = 0; i < scores.length; i++) {
            String newScore = String.valueOf(scores[i]);
            assertTrue(gradeOne.equals(newScore));
            assertTrue(gradeTwo.equals(newScore));
        }
    }

    @Test
    void testSum() {

        fail("Not yet implemented");
    }

    @Test
    void testMinimum() {

        fail("Not yet implemented");
    }

    @Test
    void testFinalScore() {
        fail("Not yet implemented");
    }

    @Test
    void testGetScoreSize() {
        fail("Not yet implemented");
    }

    @Test
    void testToString() {
        fail("Not yet implemented");
    }

}
