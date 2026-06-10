import java.util.Scanner;
public class StudentGradeMain{
    public static void main(String[] args){
    Scanner inputCollector = new Scanner(System.in);
    
    System.out.print("Enter the number of students: ");
    int students = inputCollector.nextInt();   
    System.out.print("Enter the number of subjects: ");
    int subjects = inputCollector.nextInt();
    
    System.out.println("Saving >>>>>>>>>>>>>>>>>>");
    System.out.println("Saved successfully");
    System.out.println();

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

    int[] totals = GradeHelper.calculateTotal(scores);
    double[] averages = GradeHelper.calculateAverage(totals, scores[0].length);
    int[] positions = GradeHelper.findPositions(totals);

    System.out.println("\n==========================================================");
    System.out.print("STUDENT\t\t");

    for(int subject = 0; subject < scores[0].length; subject++){
        System.out.print("SUB" + (subject + 1) + "\t");
    }
    System.out.println("TOT\tAVG\tPOS");
    System.out.println("============================================================");

    for(int student = 0; student < scores.length; student++){
        System.out.print("Student " + (student + 1) + "\t");

        for(int subject = 0; subject < scores[0].length; subject++){
            System.out.print(scores[student][subject] + "\t");
        }

        System.out.printf("%d\t%.2f\t%d%n", totals[student], averages[student], positions[student]);
    }

    System.out.println("==============================================================");
    System.out.println("==============================================================");
    
    System.out.println("\nSUBJECT SUMMARY");
    for(int subject = 0; subject < scores[0].length; subject++){
    int    subjectTotal   = GradeHelper.calculateSubjectTotal(scores, subject);
    double subjectAverage = GradeHelper.calculateSubjectAverage(scores, subject);
    int[]  highest        = GradeHelper.findHighestScoringStudent(scores, subject);
    int[]  lowest         = GradeHelper.findLowestScoringStudent(scores, subject);

    int passes = 0, failures = 0;
    for(int student = 0; student < scores.length; student++){
        if(scores[student][subject] >= 50) passes++; else failures++;
    }

    System.out.println("Subject " + (subject + 1));
    System.out.printf("Highest scoring student is: student %d scoring %d%n", (highest[0] + 1), highest[1]);
    System.out.printf("Lowest scoring student is: student %d scoring %d%n",  (lowest[0]  + 1), lowest[1]);
    System.out.printf("Total Score is: %d%n",      subjectTotal);
    System.out.printf("Average score is: %.2f%n",  subjectAverage);
    System.out.printf("Number of passes: %d%n",    passes);
    System.out.printf("Number of fails: %d%n%n",   failures);
    }

    int[] hardest        = GradeHelper.findHardestSubject(scores);
    int[] easiest        = GradeHelper.findEasiestSubject(scores);
    int[] overallHighest = GradeHelper.findOverallHighest(scores);
    int[] overallLowest  = GradeHelper.findOverallLowest(scores);

    System.out.printf("The hardest subject is Subject %d with %d failures%n", (hardest[0] + 1), hardest[1]);
    System.out.printf("The easiest subject is Subject %d with %d passes%n",(easiest[0] + 1), easiest[1]);
    System.out.printf("The overall Highest score is scored by Student %d in subject %d scoring %d%n", (overallHighest[0] + 1), (overallHighest[1] + 1), overallHighest[2]);
    System.out.printf("The overall Lowest score is scored by Student %d in subject %d scoring %d%n", (overallLowest[0]  + 1), (overallLowest[1]  + 1), overallLowest[2]);
    
    int bestStudent     = GradeHelper.findBestStudent(totals);
    int worstStudent    = GradeHelper.findWorstStudent(totals);
    int classTotal      = GradeHelper.calculateClassTotal(totals);
    double classAverage = GradeHelper.calculateClassAverage(totals);

    System.out.printf("%nCLASS SUMMARY%n");
    System.out.printf("Best Student: Student %d Score = %d%n",  (bestStudent  + 1), totals[bestStudent]);
    System.out.printf("Worst Student: Student %d Score = %d%n", (worstStudent + 1), totals[worstStudent]);
    System.out.printf("Class Total Score is: %d%n",     classTotal);
    System.out.printf("Class Average Score is: %.2f%n", classAverage);
    }
}
