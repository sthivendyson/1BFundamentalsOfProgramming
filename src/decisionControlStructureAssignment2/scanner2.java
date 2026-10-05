package decisionControlStructureAssignment2;

import java.util.Scanner;

public class scanner2 {
    public static void main (String[] args) {
        double hourlyRate = 0.0;
        double hoursWorked = 0.0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter hourly rate here: ");
        hourlyRate = input.nextDouble();
        System.out.print("Enter hours worked here: ");
        hoursWorked = input.nextDouble();

        double grossPay = hourlyRate * hoursWorked;
        double taxPercent = 0.0;

        if (grossPay >= 0 && grossPay <= 2000) {
            taxPercent = 0.10;
        }
        else if (grossPay >= 2001 && grossPay <= 4000) {
            taxPercent = 0.12;
        }
        else if (grossPay >= 4001 && grossPay <= 10000) {
            taxPercent = 0.15;
        }
        else if (grossPay >= 10001) {
            taxPercent = 0.20;
        }
        double withholdingTax = grossPay * taxPercent;
        double netPay = grossPay - withholdingTax;

        System.out.println("Gross Pay: " + grossPay);
        System.out.println("Withholding Tax: " + withholdingTax);
        System.out.println("Net Pay: " + netPay);
    }
}