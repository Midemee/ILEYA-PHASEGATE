public class ArraysCheck{

    public static int [] duplicateNumber(int [] numbers){
        int count = 0;

        for(int index = 0; index < numbers.length; index++){
            for(int inner = index + 1; inner < numbers.length; inner++){
                if (numbers[index] == numbers[inner]){
                    count++;
                }
            }
        }

        int [] result = new int [count];
        int counter = 0;
        
        for(int index = 0; index < numbers.length; index++){
            for(int inner = index + 1; inner < numbers.length; inner++){
                if (numbers[index] == numbers[inner]){
                   result[counter] = numbers[inner];
                   counter++;
                }
            }
        }
        return result;   
    }
    

    public static int [] sort(int [] numbers){
    
        for(int index = 0; index < numbers.length; index++){
            for(int inner = index + 1; inner < numbers.length; inner++){
                if(numbers[index] < numbers[inner]){
                    int temp = numbers[index];
                    numbers[index] = numbers[inner];
                    numbers[inner] = temp;
                }   
            }

         }
         return numbers;
    }
    

}
