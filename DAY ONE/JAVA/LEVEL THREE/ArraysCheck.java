public class ArraysCheck{

    public static int[] mergeLists(int[][] numbers){
        int count = 0;
        for(int index = 0; index < numbers.length; index++){
            for(int inner = 0; inner < numbers[index].length; inner++){
                count++;
            }
        }
        int [] merged = new int [count];
        int counter = 0;
        for(int index = 0; index < numbers.length; index++){
            for(int inner = 0; inner < numbers[index].length; inner++){
                merged[counter] = numbers[index][inner];
                counter++;
            }
        }
        return merged;
    }
    
    public static int [] sort(int [] numberOne, int[] numberTwo){
        int count = 0;
        for(int index = 0; index < numberOne.length; index++){
            count++;
        }
        for(int index = 0; index < numberTwo.length; index++){
            count++;
        }
        
        int [] sorted = new int [count] ;
        int counter = 0;
        
        for(int index = 0; index < numberOne.length; index++){
            sorted[counter] = numberOne[index];
            counter++;
        }
        for(int index = 0; index < numberTwo.length; index++){
            sorted[counter] = numberTwo[index];
            counter++;
        }
        
        for(int index = 0; index < sorted.length; index++){
            for(int inner = index + 1; inner < sorted.length; inner++){
                if(sorted[index] > sorted[inner]){
                    int temp = sorted[index];
                    sorted[index] = sorted[inner];
                    sorted[inner] = temp;
                }   
            }
         }
        return sorted;
    }
}
