package Activities;

import java.util.Scanner;
import java.util.InputMismatchException; // Imports the specific exception

public class GetUserInfo {
    public static void main(String[] args) {
        String name;
        int age;
        Scanner inputDevice = new Scanner(System.in);

        try {
            System.out.print("Please enter your name: ");
            name = inputDevice.nextLine();

            System.out.print("Please enter your age: ");
            // If the user types a text instead of a number, it throws an error here
            age = inputDevice.nextInt();

            // will only print if age is entered correctly
            System.out.println("Your name is " + name +" and you are " + age + " years old.");

        } catch (InputMismatchException e) {
            // Catches the crash to display a friendly error message
            System.out.println("Error: Age must be a whole number");
        } finally {
            // Always runs, ensuring the scanner is closed to prevent memory leaks
            inputDevice.close ();
        }
    }
}