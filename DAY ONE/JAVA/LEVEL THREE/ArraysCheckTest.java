import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArraysCheckTest{

    @Test
    public void testThatAnArrayOfArraysIsReturnedInASingleMergedList(){
    int [][] lists = {{9, 0, 7}, {3, 5, 1}, {8, 1, 7}, {9, 9, 6}};
    int [] actual = ArraysCheck.mergeLists(lists);
    int [] result = {9, 0, 7, 3, 5, 1, 8, 1, 7, 9, 9, 6};
    assertArrayEquals(actual, result);
    }
    
    @Test
    public void testThatTwoArrayReturnsSortedMergedList(){
    int [] firstNumber = {3, 5, 1};
    int [] secondNumber = {2, 4, 6};
    int [] actual = ArraysCheck.sort(firstNumber, secondNumber);
    int [] result = {1, 2, 3, 4, 5, 6};
    assertArrayEquals(actual, result);
    }

}

