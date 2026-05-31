public class ArraysCheck{

    public static int [][] evenOdd(int [] list){ 
        int evenCount = 0;
        int oddCount = 0;
        
        for(int index = 0; index < list.length; index++){
            if(list[index] % 2 == 0){
            evenCount++; 
            }
            else{
            oddCount++;
            }
        }
        
        int [] odd = new int [oddCount];
        int [] even = new int [evenCount];
        
        int oddIndex = 0;
        int evenIndex = 0;
        
        for(int index = 0; index < list.length; index++){
            if(list[index] % 2 == 0){
            even[evenIndex] = list[index];
            evenIndex++; 
            }
            else{
            odd[oddIndex] = list[index];
            oddIndex++;
            }
        }
        int [][] result = {odd, even};
        return result;
    }

    public static boolean isPalindrome(int [] list){
    int left = 0;
    int right = list.length-1;
    
        while(left < right){
            if(list[left] != list[right]){
                return false;
            }
            else{
                left++;
                right--;
            }
        }
       return true;
    }
    
    public static int [] perfectSquare(int [] list){

        int count = 0;
        for(int index = 0; index < list.length; index++){
            int squareRoot = (int)Math.sqrt(list[index]);
            if(squareRoot * squareRoot == list[index]){
                count++;
            }            
        }
        int [] result = new int [count]; 
        int counter = 0;
        for(int index = 0; index < list.length; index++){
            int squareRoot = (int)Math.sqrt(list[index]);
            if(squareRoot * squareRoot == list[index]){
                result[counter] = list[index];
                counter++;
            }            
        }        
        
        return result;
    }
    
    public static int [] nonPerfectSquare(int [] list){
        
        for(int index = 0; index < list.length; index++){
            int squareRoot = (int)Math.sqrt(list[index]);
            if(squareRoot * squareRoot != list[index]){
            list[index] = -1;
            }            
        }
        return list;
    }
    
}
