import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArraysCheckTest{

    @Test
    public void testThatAnArrayReturnsSeperatedListOfEvenAndOdd(){
    int [] numbers = {45, 60, 3, 10, 9, 22};
    int [][] actual = ArraysCheck.evenOdd(numbers);
    int [][] result = {{45, 3, 9}, {60, 10, 22}};
    assertArrayEquals(actual, result);
    }
    
    @Test
    public void testThatAnArrayIsPalindrome(){
    int [] numbers = {45, 0, 8, 0, 45};
    boolean isPalindrome = ArraysCheck.isPalindrome(numbers);
    assertTrue(isPalindrome);
    }
    
    @Test
    public void testThatAnArrayReturnsPerfectSquare(){
    int [] numbers = {4, 7, 9, 10, 16, 18};
    int [] result = {4, 9, 16};
    int[] actual = ArraysCheck.perfectSquare(numbers);
    assertArrayEquals(actual, result);
    }
    
    @Test
    public void testThatAnArrayReturnsNonPerfectSquare(){
    int [] numbers = {4, 7, 9, 10, 49, 6};
    int [] result = {4, -1, 9, -1, 49 , -1};
    int[] actual = ArraysCheck.nonPerfectSquare(numbers);
    assertArrayEquals(actual, result);
    }


}


