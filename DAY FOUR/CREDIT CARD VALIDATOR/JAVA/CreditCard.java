import java.util.Scanner;
public class CreditCard{
    public static void main(String[] args){
    Scanner inputCollector = new Scanner(System.in);
    System.out.print("Enter your credit card number: ");
    String cardNumber = inputCollector.nextLine();
    
    if (isValid(cardNumber)){
        System.out.println("Credit Card Status: Valid");
    }else{
        System.out.println("Credit Card Status: Invalid");
    }
    
    System.out.println("Card Type: " + getCardType(cardNumber));
    
    }
    
    public static boolean isValid(String cardNumber){
        int length = cardNumber.length();
        if(length < 13 || length > 16){
            return false;
        }
        
        int sumOne = 0;
        for(int index = length-2; index >= 0; index -=2){
            int digit = cardNumber.charAt(index) - '0';
            int doubled = digit * 2;
            
            if(doubled > 9){
                doubled = doubled / 10 + doubled % 10;
            } 
            sumOne += doubled; 
        }
        
        int sumTwo = 0;
        for(int index = length-1; index >= 0; index -=2){
            int digit = cardNumber.charAt(index) - '0';
            sumTwo += digit; 
        }
        

        return (sumOne + sumTwo) % 10 == 0;
    }
    
    public static String getCardType(String cardNumber){

        if(cardNumber.startsWith("37")){
            return "American Express";
        }else if(cardNumber.startsWith("4")){
            return "Visa Card";
        }else if(cardNumber.startsWith("5")){
            return "MasterCard";
        }else if(cardNumber.startsWith("6")){
            return "Discover";
        }else{
            return "Invalid Card";
        }
    }
      
}

