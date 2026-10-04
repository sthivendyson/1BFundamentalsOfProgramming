import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class bufferedReader1 {
    public static void main (String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        int year = 0; System.out.print("Enter the year: ");
        try {
            year = Integer.parseInt(dataIn.readLine());
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("It is a leap year.");
                }
                else {
                    System.out.println("It is not a leap year.");
                }
            }
            else if (year % 4 == 0) {
                System.out.println("It is a leap year.");
            }
            else {
                System.out.println("It is not a leap year.");
            }
        } catch (IOException e) {
            System.out.println("Error!");
        }
} }