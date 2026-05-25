import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArraysCheckTest{

    @Test
    public void testThatAnArrayOfArraysIsReturnedInASingleMergedList(){
    String text = "Hello - World";
    int [] actual = ArraysCheck.vowelsAndConsonants(lists);
    String[][] result = {{vowels, 3} {consonants,3}};
    assertArrayEquals(actual, result);
    }

}
