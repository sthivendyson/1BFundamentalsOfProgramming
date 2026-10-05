package decisionControlStructureAssignment2;

import javax.swing.JOptionPane;

public class jOptionPane2 {
    public static void main (String[] args) {

        String Input1 = JOptionPane.showInputDialog("Input hourly pay here");
        String Input2 = JOptionPane.showInputDialog("Input hours worked here");
        double hourlyPay = Double.parseDouble(Input1);
        double hoursWorked = Double.parseDouble(Input2);
        double grossPay = hourlyPay * hoursWorked;
        double taxPercentage = 0.0;

        if (grossPay >= 0 && grossPay <= 2000) {
            taxPercentage = 0.10;
        } else if (grossPay >= 2001 && grossPay <= 4000) {
            taxPercentage = 0.12;
        } else if (grossPay >= 4001 && grossPay <= 10000) {
            taxPercentage = 0.15;
        } else if (grossPay >= 10001) {
            taxPercentage = 0.20;
        }
        double withholdingTax = grossPay * taxPercentage;
        double netPay = grossPay - withholdingTax;

        JOptionPane.showMessageDialog(null,
                "Gross Pay: " + grossPay + "\n" +
                "Withholding Tax: " + withholdingTax + "\n" +
                "Net Pay: " + netPay
        );

    }
}