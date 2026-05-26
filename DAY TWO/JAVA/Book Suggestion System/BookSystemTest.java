import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookSystemTest{

    @Test
    public void testThatSuggestedBookIsFromTheList(){
    String [] bookList = {"Solo", "SuperIntelligence", "India After Ghandi", "Dream Count", "Gaza", "Ripple", "hidden Genius", "Option B", "The Attributes", "Animal Farm"};
    String bookChoice = BookSystem.getSuggestedBooks(bookList);
    assertNotNull(bookChoice);
    System.out.println("Suggested Book: " + bookChoice);
    }     
    
    @Test
    public void testThatPageNumberIsBetweenOneAndHundred(){
    int pageNumber = BookSystem.getPageNumber();
    assertTrue(pageNumber >= 1);
    assertTrue(pageNumber <= 100);
    System.out.println("Page Number: " + pageNumber);
    }
}
