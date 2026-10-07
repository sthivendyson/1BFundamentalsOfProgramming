package decisionControlStructureAssignment4;

import javax.swing.JOptionPane;

public class jOptionPane4 {
    public static void main (String[] args) {
        try {
            double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height in centimeters/cm"));
            double age = Double.parseDouble(JOptionPane.showInputDialog("Enter your age"));
            char citizenship = JOptionPane.showInputDialog("Enter your citizenship code (C for citizen of Endor, and N for non-citizen)").charAt(0);
            char recomendee = JOptionPane.showInputDialog("Enter your recomendee code(R for recomendee, N for non-recomendee").charAt(0);
            if (recomendee == 'R') {
                JOptionPane.showMessageDialog(null,"You are accepted!");
            } else if (height >= 200 && age >= 21 && age <= 25 && citizenship == 'C') {
                JOptionPane.showMessageDialog(null,"You are accepted!");
            } else {
                JOptionPane.showMessageDialog(null,"You are REJECTED!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR!");
        }
    }
}