import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentGradeTest{

    @Test
    public void testThatIfIPassAStudentScoresOnAllSubjectsItWillGivesCorrectTotal(){
        int[][] scores = {{65, 83, 40}};
        int[] result = StudentGrade.calculateTotal(scores);
        assertEquals(188, result[0]);
    }

    @Test
    public void testThatTotalOfStudentScoresWithZerosGivesCorrectTotal(){
        int[][] scores = {{75, 0, 42}};
        int[] result   = StudentGrade.calculateTotal(scores);
        assertEquals(117, result[0]);
    }

    @Test
    public void testThatIfIPassMultipleStudentScoresOnAllSubjectsItWillGivesCorrectTotalForEachStudent(){
        int[][] scores = {{65, 83, 40}, {75, 0, 42}};
        int[] result = StudentGrade.calculateTotal(scores);
        assertEquals(188, result[0]);
        assertEquals(117, result[1]);
    }

    @Test
    public void testThatIfIpassTotalScoreForOneStudentItWillGiveTheCorrectAverage(){
        int[] totals = {220};
        double[] averages = StudentGrade.calculateAverage(totals, 3);
        assertEquals(73.33, averages[0], 0.01);
    }

    @Test
    public void testThatAverageOfStudentScoresWithZerosGivesAccurateResult(){
        int[] totals= {134};
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
    public void testThatIfIPassStudentTotalItWillGiveTheCorrectPositionOfTheStudent(){
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
   @Test
    public void testThatIfIPassScoresForAllSubjectsItGivesCorrectTotal(){
        int[][] scores = {{67, 21, 49}, {98, 62, 56}, {93, 34, 27}, {78, 83, 66}};
        assertEquals(336, StudentGrade.calculateSubjectTotal(scores, 0));
        assertEquals(200, StudentGrade.calculateSubjectTotal(scores, 1));
        assertEquals(198, StudentGrade.calculateSubjectTotal(scores, 2));
    }

    @Test
    public void testThatIfIPassScoresForAllSubjectsItGivesCorrectAverage(){
        int[][] scores = {{67, 21, 49}, {98, 62, 56}, {93, 34, 27}, {78, 83, 66}};
        assertEquals(84.00, StudentGrade.calculateSubjectAverage(scores, 0), 0.01);
        assertEquals(50.00, StudentGrade.calculateSubjectAverage(scores, 1), 0.01);
        assertEquals(49.50, StudentGrade.calculateSubjectAverage(scores, 2), 0.01);
    }

    @Test
    public void ThatIfIPassAllScoresForAllStudentsIWillFindTheHighestScoringStudent(){
        int[][] scores = {{67, 21, 49}, {98, 62, 56}, {93, 34, 27}, {78, 83, 66}};
        int[] result   = StudentGrade.findHighestScoringStudent(scores, 0);
        assertEquals(1, result[0]);
        assertEquals(98, result[1]);
    }

    @Test
    public void ThatIfIPassAllScoresForAllStudentsIWillFindTheLowestScoringStudent(){
        int[][] scores = {{67, 21, 49}, {98, 62, 56}, {93, 34, 27}, {78, 83, 66}};
        int[] result   = StudentGrade.findLowestScoringStudent(scores, 0);
        assertEquals(0, result[0]);
        assertEquals(67, result[1]);
    }

    
    }
}
