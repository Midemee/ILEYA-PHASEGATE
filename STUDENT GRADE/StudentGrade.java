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
    int[] totals      = calculateTotal(scores);
    double[] averages = calculateAverage(totals, scores[0].length);
    int[] positions   = findPositions(totals);

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
    int   subjectTotal   = calculateSubjectTotal(scores, subject);
    double subjectAverage = calculateSubjectAverage(scores, subject);
    int[] highest        = findHighestScoringStudent(scores, subject);
    int[] lowest         = findLowestScoringStudent(scores, subject);

    // count passes and fails for this subject
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

    int[] hardest         = findHardestSubject(scores);
    int[] easiest         = findEasiestSubject(scores);
    int[] overallHighest  = findOverallHighest(scores);
    int[] overallLowest   = findOverallLowest(scores);

    System.out.printf("The hardest subject is Subject %d with %d failures%n",                                        (hardest[0]        + 1), hardest[1]);
    System.out.printf("The easiest subject is Subject %d with %d passes%n",                                          (easiest[0]        + 1), easiest[1]);
    System.out.printf("The overall Highest score is scored by Student %d in subject %d scoring %d%n", (overallHighest[0] + 1), (overallHighest[1] + 1), overallHighest[2]);
    System.out.printf("The overall Lowest score is scored by Student %d in subject %d scoring %d%n",  (overallLowest[0]  + 1), (overallLowest[1]  + 1), overallLowest[2]);
    
    int bestStudent     = findBestStudent(totals);
    int worstStudent    = findWorstStudent(totals);
    int classTotal      = calculateClassTotal(totals);
    double classAverage = calculateClassAverage(totals);

    System.out.printf("%nCLASS SUMMARY%n");
    System.out.printf("Best Student: Student %d Score = %d%n",  (bestStudent  + 1), totals[bestStudent]);
    System.out.printf("Worst Student: Student %d Score = %d%n", (worstStudent + 1), totals[worstStudent]);
    System.out.printf("Class Total Score is: %d%n",     classTotal);
    System.out.printf("Class Average Score is: %.2f%n", classAverage);
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
    
    public static int[] calculateTotal(int [][] scores){
        int [] totalScore = new int [scores.length];

        for(int student = 0; student < scores.length; student++){
            int sum = 0;     
            for(int subject = 0; subject < scores[student].length; subject++){
                sum += scores[student][subject];
            }
            totalScore[student] = sum;
        }
        return totalScore;
    }
    
    public static double [] calculateAverage(int [] totals, int subjects){
        double [] averages = new double[totals.length];

            for(int index = 0; index < totals.length; index++){
                averages[index] = (double)totals[index]/subjects;
            }
        return averages;
    }
    
    public static int[] findPositions(int[] totals){
    int[] positions = new int[totals.length];

    for (int currentStudent = 0; currentStudent < totals.length; currentStudent++) {
        int rank = 1;

        for (int otherStudent = 0; otherStudent < totals.length; otherStudent++) {
            if (totals[otherStudent] > totals[currentStudent]) {
                rank++;
            }
        }

        positions[currentStudent] = rank;
    }

    return positions;
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
    
    public static int[] findHardestSubject(int[][] scores){
    int hardestSubject  = 0;
    int highestFailures = -1;

    for(int subject = 0; subject < scores[0].length; subject++){
        int failures = 0;
        for(int student = 0; student < scores.length; student++){
            if(scores[student][subject] < 50) failures++;
        }
        if(failures > highestFailures){
            highestFailures = failures;
            hardestSubject  = subject;
        }
    }
    int[] result = {hardestSubject, highestFailures};
    return result;
    }

    public static int[] findEasiestSubject(int[][] scores){
    int easiestSubject = 0;
    int highestPasses  = -1;

    for(int subject = 0; subject < scores[0].length; subject++){
        int passes = 0;
        for(int student = 0; student < scores.length; student++){
            if(scores[student][subject] >= 50) passes++;
        }
        if(passes > highestPasses){
            highestPasses  = passes;
            easiestSubject = subject;
        }
    }
    int[] result = {easiestSubject, highestPasses};
    return result;
    }

    public static int[] findHighestScoringStudent(int[][] scores, int subject){
    int highestScore        = scores[0][subject];
    int highestScoreStudent = 0;

    for(int student = 0; student < scores.length; student++){
        if(scores[student][subject] > highestScore){
            highestScore        = scores[student][subject];
            highestScoreStudent = student;
        }
    }
    int[] result = {highestScoreStudent, highestScore};
    return result;
    }

    public static int[] findLowestScoringStudent(int[][] scores, int subject){
    int lowestScore        = scores[0][subject];
    int lowestScoreStudent = 0;

    for(int student = 0; student < scores.length; student++){
        if(scores[student][subject] < lowestScore){
            lowestScore        = scores[student][subject];
            lowestScoreStudent = student;
        }
    }
    int[] result = {lowestScoreStudent, lowestScore};
    return result;
    }

    public static int[] findOverallHighest(int[][] scores){
    int highestStudent = 0, highestSubject = 0;
    int overallHighest = scores[0][0];

    for(int student = 0; student < scores.length; student++){
        for(int subject = 0; subject < scores[0].length; subject++){
            if(scores[student][subject] > overallHighest){
                overallHighest = scores[student][subject];
                highestStudent = student;
                highestSubject = subject;
            }
        }
    }
    int[] result = {highestStudent, highestSubject, overallHighest};
    return result;
    }

    public static int[] findOverallLowest(int[][] scores){
    int lowestStudent = 0, lowestSubject = 0;
    int overallLowest = scores[0][0];

    for(int student = 0; student < scores.length; student++){
        for(int subject = 0; subject < scores[0].length; subject++){
            if(scores[student][subject] < overallLowest){
                overallLowest = scores[student][subject];
                lowestStudent = student;
                lowestSubject = subject;
            }
        }
    }
    int[] result = {lowestStudent, lowestSubject, overallLowest};
    return result;
    }

    public static int findBestStudent(int[] totals) {
    int bestStudent  = 0;
    int highestTotal = totals[0];

    for(int student = 0; student < totals.length; student++) {
        if(totals[student] > highestTotal) {
            highestTotal = totals[student];
            bestStudent  = student;
        }
    }
    return bestStudent;
    }

    public static int findWorstStudent(int[] totals) {
    int worstStudent = 0;
    int lowestTotal  = totals[0];

    for(int student = 0; student < totals.length; student++) {
        if(totals[student] < lowestTotal) {
            lowestTotal  = totals[student];
            worstStudent = student;
        }
    }
    return worstStudent;
    }

    public static int calculateClassTotal(int[] totals) {
    int classTotal = 0;
    for(int student = 0; student < totals.length; student++) {
        classTotal += totals[student];
    }
    return classTotal;
    }

    public static double calculateClassAverage(int[] totals) {
    return (double) calculateClassTotal(totals) / totals.length;
    }

}
