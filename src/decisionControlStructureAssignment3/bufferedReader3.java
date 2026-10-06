package decisionControlStructureAssignment3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class bufferedReader3 {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
        System.out.print("Please input your parents' salary: ");
        double salary = Double.parseDouble(br.readLine());
        System.out.print("Please input NSAT score: ");
        double score = Double.parseDouble(br.readLine());
        System.out.print("Please input your entrance exam score: ");
        double score2 = Double.parseDouble(br.readLine());
        double average = (score + score2) / 2;
        if (salary > 10000 || score < 90 || score2 < 85) {
            System.out.println("You are rejected");
        }
        else if (salary <= 3500 && average >= 91) {
            System.out.println("Congratulations, you now have a college scholarship!");
        }
        else {
            System.out.println("Your application will be reviewed");
        }
        } catch (Exception e) {
            System.out.println("Error, the input must be a number!");
        }
    }
}