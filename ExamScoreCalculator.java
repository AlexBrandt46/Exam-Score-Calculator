package exam.score.calculator;

import java.util.Scanner;

public class ExamScoreCalculator {
    public static void main(String[] args) {
        
        double desiredGrade, currentGrade, necessaryGrade;
        Scanner in = new Scanner (System.in);
        
        //get the current grade from the user
        System.out.println ("What is the current grade that you have in your class?");
            currentGrade = in.nextDouble();
        
        //get the desired grade
        System.out.println ("What is the numerical grade you want to recieve in the class?");
            desiredGrade = in.nextDouble();
        
        //calculates the required grade on the exam
        necessaryGrade = (desiredGrade - (.8 * currentGrade)) / .2;
        
        System.out.println ("The grade that you need to score on your exam is: " + necessaryGrade + ".");
    }   
}

