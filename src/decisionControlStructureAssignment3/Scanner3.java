package decisionControlStructureAssignment3;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Scanner3 {
    public static void main (String[] args) {
        double salary = 0.0;
        double score = 0.0;
        double score2 = 0.0;
        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Enter parents' salary: ");
            salary = input.nextDouble();
            System.out.print("Enter NSAT score: ");
            score = input.nextDouble();
            System.out.print("Enter entrance exam score: ");
            score2 = input.nextDouble();
            double avg = (score + score2) / 2;
            if (salary > 10000 || score < 90 || score2 < 85) {
                System.out.println("You are rejected");
            } else if (salary <= 3500 && avg >= 91) {
                System.out.println("Congratulations, you now have a college scholarship!");
            } else {
                System.out.println("Your application will be reviewed");
            }
        } catch (InputMismatchException e) {
            System.out.println("Input should always be a number!");
        }
    }
}