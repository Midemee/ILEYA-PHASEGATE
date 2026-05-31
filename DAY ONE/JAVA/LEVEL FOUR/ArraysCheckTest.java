import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArraysCheckTest{

    @Test
    public void testThatTheSumOfElementsOfIndicesZeroAndOneGivesAccurateResult(){
    int [] list = {2, 7, 11, 15};
    int target = 9;
    int [] result = {0,1};
    int[] actual = ArraysCheck.getIndices(list,target);
    assertArrayEquals(actual, result);
    }
    
    
    @Test
    public void testThatTheSumOfElementsOfIndicesOneAndTwoGivesAccurateResult(){
    int [] list = {2, 7, 11, 15};
    int target = 26;
    int [] result = {2,3};
    int[] actual = ArraysCheck.getIndices(list,target);
    assertArrayEquals(actual, result);
    }
    
    @Test
    public void testThatTheSumOfElementsOfIndicesTwoAndThreeGivesAccurateResult(){
    int [] list = {2, 7, 11, 15};
    int target = 18;
    int [] result = {1,2};
    int[] actual = ArraysCheck.getIndices(list,target);
    assertArrayEquals(actual, result);
    }

}
