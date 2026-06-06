import java.util.Scanner;
public class MideQuizGrader{
    public static void main(String[] args){
    Scanner inputCollector = new Scanner(System.in);
    
    
    System.out.print("Enter the number of students enrolled: ");
    int students = inputCollector.nextInt(); 
  
    System.out.print("Enter the number of quizzes taken: ");
    int quizzes= inputCollector.nextInt();
    
    int [][] scores = new int[students] [quizzes];
    
    

    for(int index = 0; index < students; index++){
        System.out.println("\n-----Student" + (index + 1) + "-----");
        for(int inner = 0; inner < quizzes; inner++){
        System.out.print("Score for Quiz" + (inner + 1) + ":");
            int score = inputCollector.nextInt();

            while(score < 0 || score >100){
                System.out.print("Enter a valid number! (1-100): ");
                score = inputCollector.nextInt();
            }
                scores[index][inner] = score;                                                    
        }

    }
    
   System.out.println("\n\n----------QUIZ GRADE REPORT----------");
    //System.out.printf("%s\t%s\t%s\t%s\t%s\t%n", "STUDENT", "QZ1", "QZ2", "QZ3", "AVG");
        System.out.print("STUDENT\t");
        for (int quiz = 0; quiz < quizzes; quiz++) {
            System.out.print("QZ" + (quiz + 1) + "\t");
        }

        System.out.println("AVG");
        
    for(int student = 0; student < students; student++){
    double sum = 0;
    System.out.print("Student" + (student+1) + " ");
        for(int quiz = 0; quiz < quizzes; quiz++){
            System.out.print(scores[student][quiz] + " ");
            sum += scores[student][quiz];
        }
        double average = sum/quizzes;
        System.out.printf("%.2f%n", average);
    }

    //QUIZ AVERAGE
    double highestQuizAverage = 0;
    int bestQuiz = 0;
    
    for(int quiz = 0; quiz < quizzes; quiz++){
        double sumQuiz = 0;
        for(int student = 0; student < students; student++){
            sumQuiz += scores[student][quiz];
        }
        
        double quizAverage = sumQuiz/students;
        System.out.printf("QZ%d: %.2f%n", quiz+1, quizAverage);
        
        
        if(quizAverage > highestQuizAverage) {
        highestQuizAverage = quizAverage;
        bestQuiz = quiz;
        }  
       
    }                       
        System.out.printf("Best Quiz: Quiz %d (Average %.2f)%n", bestQuiz+1, highestQuizAverage);
    }

}

