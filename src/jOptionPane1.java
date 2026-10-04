import javax.swing.JOptionPane;

public class jOptionPane1 {
    public static void main (String[] args) {
        String msg1 = "It is a leap year";
        String msg2 = "It is not a leap year";
        int year = 0;
        String Input = JOptionPane.showInputDialog("Input the year here");
        year = Integer.parseInt(Input);
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                JOptionPane.showMessageDialog(null, msg1);
            }
            else {
                JOptionPane.showMessageDialog(null, msg2);
            }
        }
        else if (year % 4 == 0) {
            JOptionPane.showMessageDialog(null, msg1);
        }
        else {
            JOptionPane.showMessageDialog(null, msg2);
        }
    }
}