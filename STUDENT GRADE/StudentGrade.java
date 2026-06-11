public class StudentGrade{

    public static int[] calculateTotal(int[][] scores){
        int[] totalScore = new int[scores.length];
        for(int student = 0; student < scores.length; student++){
            int sum = 0;     
            for(int subject = 0; subject < scores[student].length; subject++){
                sum += scores[student][subject];
            }
            totalScore[student] = sum;
        }
        return totalScore;
    }
    
    public static double[] calculateAverage(int[] totals, int subjects){
        double[] averages = new double[totals.length];
        for(int index = 0; index < totals.length; index++){
            averages[index] = (double)totals[index]/subjects;
        }
        return averages;
    }
    
    public static int[] findPositions(int[] totals){
        int[] positions = new int[totals.length];
        for(int currentStudent = 0; currentStudent < totals.length; currentStudent++){
            int rank = 1;
            for(int otherStudent = 0; otherStudent < totals.length; otherStudent++){
                if(totals[otherStudent] > totals[currentStudent]) rank++;
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
        int total = calculateSubjectTotal(scores, subject);
        return (double)total/scores.length;
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
        int highestPasses = -1;
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
        int highestScore = scores[0][subject];
        int highestScoreStudent = 0;
        for(int student = 0; student < scores.length; student++){
            if(scores[student][subject] > highestScore){
                highestScore = scores[student][subject];
                highestScoreStudent = student;
            }
        }
        int[] result = {highestScoreStudent, highestScore};
        return result;
    }

    public static int[] findLowestScoringStudent(int[][] scores, int subject){
        int lowestScore = scores[0][subject];
        int lowestScoreStudent = 0;
        for(int student = 0; student < scores.length; student++){
            if(scores[student][subject] < lowestScore){
                lowestScore = scores[student][subject];
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

    public static int findBestStudent(int[] totals){
        int bestStudent  = 0;
        int highestTotal = totals[0];
        for(int student = 0; student < totals.length; student++){
            if(totals[student] > highestTotal){
                highestTotal = totals[student];
                bestStudent  = student;
            }
        }
        return bestStudent;
    }

    public static int findWorstStudent(int[] totals){
        int worstStudent = 0;
        int lowestTotal  = totals[0];
        for(int student = 0; student < totals.length; student++){
            if(totals[student] < lowestTotal){
                lowestTotal  = totals[student];
                worstStudent = student;
            }
        }
        return worstStudent;
    }

    public static int calculateClassTotal(int[] totals){
        int classTotal = 0;
        for(int student = 0; student < totals.length; student++){
            classTotal += totals[student];
        }
        return classTotal;
    }

    public static double calculateClassAverage(int[] totals){
        return (double) calculateClassTotal(totals) / totals.length;
    }
}
