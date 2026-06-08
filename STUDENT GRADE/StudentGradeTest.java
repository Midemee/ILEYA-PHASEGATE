import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentGradeTest{

    @Test
        public void testThatTotalOfAStudentScoresOnallSubjectsGivesAccurateResult(){
        int [] scores = {65, 83, 40};
        int actual = StudentGrade.calculateTotal(scores);
        int expected = 188;
        assertEquals(expected, actual);        
        }

    @Test
        public void testThatTotalOfAStudentScoresWithZerosOnSomeSubjectsGivesAccurateResult(){
        int [] scores = {75, 0, 42};
        int actual = StudentGrade.calculateTotal(scores);
        int expected = 117;
        assertEquals(expected, actual);        
        }
    
    @Test
        public void testThatAverageOfAStudentScoresOnallSubjectsGivesAccurateResult(){
        int [] scores = {50, 80, 90};
        double actual = StudentGrade.calculateAverage(scores);
        double expected = 73.33;
        assertEquals(expected, actual, 0.01);        
        }
        
    @Test
        public void testThatAverageOfAStudentScoresWithZerosOnSomeSubjectsGivesAccurateResult(){
        int [] scores = {55, 0, 79};
        double actual = StudentGrade.calculateAverage(scores);
        double expected = 44.67;
        assertEquals(expected, actual, 0.01);        
        }

}
