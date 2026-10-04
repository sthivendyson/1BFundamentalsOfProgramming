import java.util.Scanner;

public class scanner1 {
    public static void main (String[] args) {
        int yr;
        Scanner inputYear = new Scanner(System.in);

        System.out.print("Input the year here: ");
        yr = inputYear.nextInt();
        if (yr % 100 == 0) {
            if (yr % 400 == 0) {
                    System.out.print("It is a leap year");
                }
            else {
                    System.out.print("It is not a leap year");
                } }
        else if (yr % 4 == 0) {
                System.out.print("It is a leap year");
            } else {
                System.out.print("It is not a leap year");
            }
        }
    }