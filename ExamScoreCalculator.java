package exam.score.calculator;

import java.util.Scanner;

public class ExamScoreCalculator {
    public static void main(String[] args) {
        double desiredGrade, currentGrade, necessaryGrade;
        Scanner in = new Scanner (System.in);
        System.out.println ("What is the current grade that you have in your class?");
            currentGrade = in.nextDouble();
        System.out.println ("What is the numerical grade you want to recieve in the class?");
            desiredGrade = in.nextDouble();
        necessaryGrade = (desiredGrade - (.8*currentGrade)) / .2;
        System.out.println ("The grade that you need to score on your exam is: " + necessaryGrade + ".");
    }   
}

//add to github