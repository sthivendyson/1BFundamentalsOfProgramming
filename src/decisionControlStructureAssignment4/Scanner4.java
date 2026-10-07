package decisionControlStructureAssignment4;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Scanner4 {
    public static void main (String[] args) {
        double height = 0.0;
        double age = 0.0;
        char citizenship = ' ';
        char recomendee = ' ';
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter your height in centimeters/cm: ");
            height = input.nextDouble();
            System.out.print("Enter your age: ");
            age = input.nextDouble();
            System.out.print("Enter your citizenship code (C for citizen of Endor, and N for non-citizen): ");
            citizenship = input.next().charAt(0);
            System.out.print("Enter your recomendee code(R for recomendee, N for non-recomendee: ");
            recomendee = input.next().charAt(0);
            if (recomendee == 'R') {
                System.out.println("You are accepted!");
            } else if (height >= 200 && age >= 21 && age <= 25 && citizenship == 'C') {
                System.out.println("You are accepted!");
            } else {
                System.out.println("You are REJECTED!");
            }
        } catch (InputMismatchException e) {
            System.out.println("ERROR!");
        }
    }
}