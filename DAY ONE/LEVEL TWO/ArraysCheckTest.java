import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArraysCheckTest{

    @Test
    public void testThatAnArrayReturnsOnlyTheDuplicateNumbers(){
    int [] list = {1, 2, 3, 2, 4, 3};
    int [] actual = ArraysCheck.duplicateNumber(list);
    int [] result = {2,3};
    assertArrayEquals(actual, result);
    }
    
    @Test
    public void testThatAnArrayReturnsOnlyTheDuplicateNumbers(){
    int [] list = {-11, -9, 3, -9, 2, -11};
    int [][] actual = ArraysCheck.duplicateNumber(list);
    int [][] result = {{-11{0,5}}, {-9{1,3}}};
    assertArrayEquals(actual, result);
    }

    @Test
    public void testThatAllZerosInAnArrayMovesToTheEnd(){
    int [] list = {5, 0 , 3, 0, 2, 0};
    int [] actual = ArraysCheck.sort(list);
    int [] result = {5, 3 , 2 , 0, 0 , 0};
    assertArrayEquals(actual, result);
    }


}

