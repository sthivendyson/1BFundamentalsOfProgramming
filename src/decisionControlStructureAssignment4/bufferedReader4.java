package decisionControlStructureAssignment4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class bufferedReader4 {
    public static void main (String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter your height in centimeters/cm: ");
            double height = Double.parseDouble(dataIn.readLine());
            System.out.print("Enter your age: ");
            int age = Integer.parseInt(dataIn.readLine());
            System.out.print("Enter your citizenship code (C for citizen of Endor, and N for non-citizen): ");
            char citizenship = dataIn.readLine().charAt(0);
            System.out.print("Enter your recomendee code(R for recomendee, N for non-recomendee: ");
            char recomendee = dataIn.readLine().charAt(0);
            if (recomendee == 'R') {
                System.out.println("You are accepted!");
            } else if (height >= 200 && age >= 21 && age <= 25 && citizenship == 'C') {
                System.out.println("You are accepted!");
            } else {
                System.out.println("You are REJECTED!");
            }
        } catch (Exception e) {
            System.out.print("Error!");
        }

    }
}