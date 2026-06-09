import java.util.Scanner;
public class StudentGrade{
    public static void main(String[] args){
    Scanner inputCollector = new Scanner(System.in);
    
    System.out.print("Enter the number of students: ");
    int students = inputCollector.nextInt();   
    System.out.print("Enter the number of subjects: ");
    int subjects = inputCollector.nextInt();
    
    System.out.println("Saving >>>>>>>>>>>>>>>>>>");
    System.out.println("Saved successfully");
    System.out.println();
    
    int[][] scores = getScores(students, subjects);
    printResult(scores, students, subjects);
    printSubjectSummary(scores, students, subjects);
    }
    
    public static int[][] getScores(int students, int subjects ){
    Scanner inputCollector = new Scanner(System.in);
    int[][] scores = new int[students][subjects];

    for(int student = 0; student < students; student++){
        for(int subject = 0; subject < subjects; subject++){
            System.out.println("Entering score for student " + (student+1));
            System.out.println("Enter score for subject " + (subject+1));
            int score = inputCollector.nextInt();
            System.out.println("Saving >>>>>>>>>>>>>>>>>>");
            System.out.println("Saved successfully");
            System.out.println();
            
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
        double average = 0;
        average = (double)calculateTotal(scores)/ scores.length;
        return average;
    }
    
    public static int[] getRankings(int[][] scores){
        int[] rankings = new int[scores.length];

        for(int student = 0; student < scores.length; student++){
            int rank = 1;
            double studentAverage = calculateAverage(scores[student]);

            for(int other = 0; other < scores.length; other++){
                double otherAverage = calculateAverage(scores[other]);
                if(otherAverage > studentAverage){
                    rank++;
                }
            }
            rankings[student] = rank;
        }
        return rankings;
    }
    
    public static void printResult(int[][] scores, int students, int subjects){
    int [] positions = getRankings(scores);
        System.out.println("\n==========================================================");
        System.out.print("STUDENT\t\t");
        
        for(int subject = 0; subject < subjects; subject++){
            System.out.print("SUB" + (subject+1) + "\t"); 
        }
        System.out.println("TOT\tAVG\tPOS");
        System.out.println("============================================================");
        for(int student = 0; student < scores.length; student++){
                System.out.print("Student " + (student + 1) + "\t");
            for(int subject = 0; subject < subjects; subject++){
                int result = scores[student][subject];
                System.out.print(result + "\t");
            }
        int total = calculateTotal(scores[student]);
        double average = calculateAverage(scores[student]);
        System.out.printf("%d\t%.2f\t%d%n", total, average, positions[student]);
        }

        System.out.println("==============================================================");
        System.out.println("==============================================================");
    }
    
    public static int calculateSubjectTotal(int[][] scores, int subject){
    int subjectTotal = 0;
    for(int student = 0; student < scores.length; student++){
        subjectTotal += scores[student][subject];
    }
    return subjectTotal;
    }
    
    public static double calculateSubjectAverage(int[][] scores, int subject){
        double subjectAverage = 0;
        int total = calculateSubjectTotal(scores, subject);
        subjectAverage = (double)total/scores.length;
        return subjectAverage;
    }
    
    public static void printSubjectSummary(int[][] scores, int students, int subjects){
    for(int subject = 0; subject < subjects; subject++){
    int totalScore = scores[0][subject];
    int passes = 0;
    int failures = 0;
    int highestStudent = 0;
    int lowestStudent = 0;
    
    int highestScore = scores[0][subject];
    int lowestScore = scores[0][subject];
    
        if(scores[0][subject] >= 50){
        passes++;
        }else{
        failures++;
        }
        
    for(int student = 1; student < students; student++){
        
        if(scores[student][subject] > highestScore){
            highestScore = scores[student][subject];
            highestStudent = student;
        }
        
        if(scores[student][subject] < lowestScore){
            lowestScore = scores[student][subject];
            lowestStudent = student;
        }
        totalScore += scores[student][subject];
        
        if(scores[student][subject] >= 50){
            passes++;
        }else{
            failures++;
        }
    }
    
    double subjectAverage = (double)totalScore / students;
    System.out.println();
    System.out.println("SUBJECT SUMMARY");    
    System.out.println("Subject " + (subject + 1));

    System.out.printf("Highest scoring student is: student %d scoring %d%n", (highestStudent + 1), highestScore);
    System.out.printf("Lowest scoring student is: student %d scoring %d%n", (lowestStudent + 1), lowestScore);
    System.out.printf("Total Score is: %d%n", totalScore);
    System.out.printf("Average score is: %.2f%n", subjectAverage);
    System.out.printf("Number of passes: %d%n", passes);
    System.out.printf("Number of fails: %d%n", failures);

    }

    }

}
