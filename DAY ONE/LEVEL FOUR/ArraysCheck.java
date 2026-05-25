public class ArraysCheck{

    public static String[][] vowelsAndConsonants(String words){
        int vowels = 0;
        int consonants = 0;

        
        for(int index 0; index < words.length(); index++){
            char letter = Character.toLowerCase(words.charAt(index));
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
                vowels++;
            }
            else if(letter >= 'a' && letter <= 'z'){
                consonants++;
            }
        }
        
        int [] counts = {vowels, consonants};
        String [][] result = {{"Vowels" + counts[0]}, {"consonants" + counts[1]}};
        return result;
    }

}
