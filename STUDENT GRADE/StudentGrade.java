import java.util.Scanner;
public class StudentGrade{
    public static void main(String[] args){
    Scanner inputCollector = new Scanner(System.in);
    
    System.out.print("Enter the number of students: ");
    int students = inputCollector.nextInt();   
    System.out.print("Enter the number of subjects: ");
    int subjects = inputCollector.nextInt();
    
    int[][] scores = getScores(students, subjects);
    printResult(scores, students, subjects);
    
    //System.out.print(java.util.Arrays.deepToString(getScores(students, subjects)));
    }
    
    public static int[][] getScores(int students, int subjects ){
    Scanner inputCollector = new Scanner(System.in);
    int[][] scores = new int[students][subjects];

    for(int student = 0; student < students; student++){
        System.out.println("\n=====STUDENT " + (student+1) + "=====");
        for(int subject = 0; subject < subjects; subject++){
            System.out.println("Subject " + (subject+1) + ": ");
            System.out.print("Enter the score for the student: ");
            int score = inputCollector.nextInt();
            
            while(score < 0 || score > 100){
                System.out.print("Enter a valid number!(1-100): ");
                score = inputCollector.nextInt();            
            }
            scores[student][subject] = score;
        }
    }
    
        return scores;
    }
    
    public static int calculateTotal(int [] scores){
        int total = 0;
        for(int index = 0; index < scores.length; index++){
            total += scores[index];
        }
        return total;
    }
    
    public static double calculateAverage(int [] scores){
/*        double sum = 0;
        double average = 0;
        for(int index = 0; index < scores.length; index++){
            sum += scores[index];
        }
        average = sum / scores.length;
        return average;*/
        double average = 0;
        average = (double)calculateTotal(scores)/ scores.length;
        return average;
    }
    
    public static void printResult(int[][] scores, int students, int subjects){
        System.out.println("\n==================================================");
        System.out.print("STUDENT\t\t");
        for(int subject = 0; subject < subjects; subject++){
            System.out.print("SUB" + (subject+1) + "\t"); 
        }
        System.out.println("TOT\tAVG\tPOS");
        System.out.println("====================================================");
        for(int student = 0; student < scores.length; student++){
                System.out.print("Student " + (student + 1) + "\t");
            for(int subject = 0; subject < subjects; subject++){
                int result = scores[student][subject];
                System.out.print(result + "\t");
            }
        int total = calculateTotal(scores[student]);
        double average = calculateAverage(scores[student]);
        System.out.printf("%d\t%.2f\t%n", total, average);
        }

        System.out.println("=====================================================");
    }

}
