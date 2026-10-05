package decisionControlStructureAssignment2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class bufferedReader2 {
    public static void main (String[] args) throws IOException{
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your hourly pay: ");
        double hourlyPay = Double.parseDouble (dataIn.readLine());
        System.out.print("Enter your hours worked: ");
        double hoursWorked = Double.parseDouble (dataIn.readLine());
        double grossPay = hourlyPay * hoursWorked;
        double taxPercentage = 0.0;

        if (grossPay >= 0 && grossPay <= 2000) {
            taxPercentage = 0.10;
        }
        else if (grossPay >= 2001 && grossPay <= 4000) {
            taxPercentage = 0.12;
        }
        else if (grossPay >= 4001 && grossPay <= 10000) {
            taxPercentage = 0.15;
        }
        else if (grossPay >= 10001){
            taxPercentage = 0.20;
        }
        double withholdingTax = grossPay * taxPercentage;
        double netPay = grossPay - withholdingTax;

        System.out.println("Gross pay: " + grossPay);
        System.out.println("Withholding Tax: " + withholdingTax);
        System.out.println("Net Pay: " + netPay);
    }
}