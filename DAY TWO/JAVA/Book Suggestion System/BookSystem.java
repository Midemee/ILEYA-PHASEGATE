import java.util.Random;
public class BookSystem{
      public static String [] books = {"Solo", "SuperIntelligence", "India After Ghandi", "Dream Count", "Gaza", "Ripple", "Option B", "The Attributes", "Animal Farm"};
     
     //public static void main(String[] args)   
     public static String getSuggestedBooks(){
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
    
    public static String [] addBooks(String newBook){
    String [] newBookList = new String[books.length + 1];
        int newIndex = 0;
        for(int index = 0; index < books.length; index ++){
        newBookList[newIndex] = books[index];
        newIndex++;
        }
        newBookList[newIndex] = newBook;
     return newBookList;
    }
    
    public static String [] removeBooks(String bookName){
    String [] newBookList = new String[books.length - 1];
    
        int newIndex = 0;
        for(int index = 0; index < books.length; index ++){
            if(!books[index].equals(bookName)){
                newBookList[newIndex] = books[index];
                newIndex++;        
            }
        }
     return newBookList;
    }
    
    public static String [] updateBooks(String oldBookName, String newBookName){
        for(int index = 0; index < books.length; index++){
            if (books[index].equals(oldBookName)){
                books[index] = newBookName;
            }
        }
        return books;
    }
    
    public static String[] showBooks(){
        return books;
    }    
}
