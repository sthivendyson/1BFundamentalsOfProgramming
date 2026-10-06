package decisionControlStructureAssignment3;

import javax.swing.JOptionPane;

public class jOptionPane3 {
    public static void main (String[] args){
        try {
            double salary = Double.parseDouble(JOptionPane.showInputDialog("Input your parents' salary here"));
            double score1 = Double.parseDouble(JOptionPane.showInputDialog("Input your NSAT score here"));
            double score2 = Double.parseDouble(JOptionPane.showInputDialog("Input your entrance exam score here"));
            double average = (score1 + score2) / 2;
            if (salary > 10000 || score1 < 90 || score2 < 85) {
                JOptionPane.showMessageDialog(null,"You are rejected");
            }
            else if (salary <= 3500 && average >= 91) {
                JOptionPane.showMessageDialog(null,"Congratulations, you now have a college scholarship!");
            }
            else {
                JOptionPane.showMessageDialog(null,"Your application will be reviewed");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"All input must be a number");
    } } }