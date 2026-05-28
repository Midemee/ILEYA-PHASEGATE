import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookSystemTest{

    @Test
    public void testThatSuggestedBookIsFromTheList(){
    String bookChoice = BookSystem.getSuggestedBooks();
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
    
    @Test
    public void testThatANewBookIsAdded(){
    String newBook = "Hidden Genius";
    String[] actual = BookSystem.addBooks(newBook);
    String[] result = {"Solo", "SuperIntelligence", "India After Ghandi", "Dream Count", "Gaza", "Ripple", "Option B", "The Attributes", "Animal Farm", "Hidden Genius"};
    assertArrayEquals(actual, result);
    }
    
    @Test
    public void testThatABookIsremoved(){
    String bookName = "Solo";
    String[] actual = BookSystem.removeBooks(bookName);
    String[] result = {"SuperIntelligence", "India After Ghandi", "Dream Count", "Gaza", "Ripple", "Option B", "The Attributes", "Animal Farm"};
    assertArrayEquals(actual, result);
    }
    
    @Test
    public void testThatBookNameIsUpdatedAfterChanges(){
    String oldBookName = "Animal Farm";
    String newBookName = "Animal Kingdom";
    String[] actual = BookSystem.updateBooks(oldBookName, newBookName);
    String[] result = {"Solo", "SuperIntelligence", "India After Ghandi", "Dream Count", "Gaza", "Ripple", "Option B", "The Attributes", "Animal Kingdom"};
    assertArrayEquals(actual, result);
    }
    
    @Test
    public void testThatBooksIsShown(){
    String[] actual = BookSystem.showBooks();
    String[] result = {"Solo", "SuperIntelligence", "India After Ghandi", "Dream Count", "Gaza", "Ripple", "Option B", "The Attributes", "Animal Kingdom"};
    assertArrayEquals(actual, result);
    }      
}
