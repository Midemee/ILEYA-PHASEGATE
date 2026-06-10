import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentGradeTest{

    @Test
    public void testThatTotalOfStudentScoresOnAllSubjectsGivesAccurateResult(){
        int[][] scores = {{65, 83, 40}};
        int[] result = StudentGrade.calculateTotal(scores);
        assertEquals(188, result[0]);
    }

    @Test
    public void testThatTotalOfStudentScoresWithZerosGivesAccurateResult(){
        int[][] scores = {{75, 0, 42}};
        int[] result = StudentGrade.calculateTotal(scores);
        assertEquals(117, result[0]);
    }

    @Test
    public void testThatTotalsAreCorrectForMultipleStudents(){
        int[][] scores = {{65, 83, 40}, {75, 0, 42}};
        int[] result = StudentGrade.calculateTotal(scores);
        assertEquals(188, result[0]);
        assertEquals(117, result[1]);
    }

    @Test
    public void testThatAverageOfStudentScoresOnAllSubjectsGivesAccurateResult(){
        int[] totals = {220};
        double[] averages = StudentGrade.calculateAverage(totals, 3);
        assertEquals(73.33, averages[0], 0.01);
    }

    @Test
    public void testThatAverageOfStudentScoresWithZerosGivesAccurateResult(){
        int[] totals      = {134};
        double[] averages = StudentGrade.calculateAverage(totals, 3);
        assertEquals(44.67, averages[0], 0.01);
    }

    @Test
    public void testThatAveragesAreCorrectForMultipleStudents(){
        int[] totals = {220, 134};
        double[] averages = StudentGrade.calculateAverage(totals, 3);
        assertEquals(73.33, averages[0], 0.01);
        assertEquals(44.67, averages[1], 0.01);
    }

    @Test
    public void testThatPositionsAreCorrectlyAssigned(){
        int[] totals = {137, 216, 154, 227};
        int[] positions = StudentGrade.findPositions(totals);
        assertEquals(4, positions[0]);
        assertEquals(2, positions[1]);
        assertEquals(3, positions[2]);
        assertEquals(1, positions[3]);
    }

    @Test
    public void testThatStudentsWithEqualTotalsGetSamePosition(){
        int[] totals = {150, 150, 200};
        int[] positions = StudentGrade.findPositions(totals);
        assertEquals(2, positions[0]);
        assertEquals(2, positions[1]);
        assertEquals(1, positions[2]);
    }

}
