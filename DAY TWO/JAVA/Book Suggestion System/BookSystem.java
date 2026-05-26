import java.util.Random;
public class BookSystem{

     public static String getSuggestedBooks(String [] books){
     Random randomPick = new Random();
     int bookChoice = randomPick.nextInt(books.length);
     
     String suggestedBook = books[bookChoice];
     return suggestedBook;
    }
    
    public static int getPageNumber(){
     Random randomPick = new Random();
     int pageNumber = randomPick.nextInt(1,101);  
     return pageNumber;
    }
}
