import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*; 


public class Comproject1 {

    // Main method
    public static void main(String[] args) {
        // Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Welcome message
        JOptionPane.showMessageDialog(null, "Welcome to the Fibonacci Sequence Calculator!");

        
        // Prompt user for input
       int num1 = Integer.parseInt( JOptionPane.showInputDialog("Enter the desired length of the Fibonacci sequence: "));

        // Input validation
        if (num1 <= 0) {
            JOptionPane.showMessageDialog(null, ("Please enter a positive integer."));
            return;
        }

        // Display message about calculation
        System.out.println("Calculating Fibonacci sequence up to " + num1 + " terms...");
        System.out.println();

        // Print the Fibonacci sequence
        System.out.print("Fibonacci Sequence: ");
        for (int i = 0; i < num1; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        // Closing message
        System.out.println();
        System.out.println("Calculation complete. Thank you for using the Fibonacci Sequence Calculator!");

                // Add a 5 seconds delay
        try {
            Thread.sleep(5000); // Pause for 5000 milliseconds (5 seconds)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println();

        // Close scanner
        scanner.close();
    }

    // Recursive method to calculate Fibonacci number
    public static int fibonacci(int n) {
        // Base case for 0
        if (n == 0) {
            return 0;
        }
        // Base case for 1
        else if (n == 1) {
            return 1;
        }
        // Recursive case
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    
    // Additional methods for information about the Fibonacci sequence

    // Method to explain Fibonacci sequence
    public static void explainFibonacci() {
        System.out.println("The Fibonacci sequence is a series of numbers in which each number ");
        System.out.println("is the sum of the two preceding numbers.");
        System.out.println("The sequence typically starts with 0 and 1.");
    }

    // Method to print a separator line
    public static void printSeparator() {
        System.out.println("============================================");
    }

    // Method to print an introduction
    public static void printIntroduction() {
        System.out.println("This program calculates the Fibonacci sequence up to a specified length.");
        System.out.println("You will be prompted to enter the length of the sequence you want.");
    }

    // Method to print conclusion
    public static void printConclusion() {
        System.out.println("The Fibonacci sequence has many applications in mathematics, computer science, ");
        System.out.println("and nature. Thank you for exploring it with us!");
    }

    // Method to show example usage
    public static void showExampleUsage() {
        System.out.println("Example: If you enter '5' as the desired length, the output will be:");
        System.out.println("0 1 1 2 3");
    }

    // Additional Fibonacci information for the user
    public static void additionalInfo() {
        System.out.println("Did you know?");
        System.out.println("The Fibonacci sequence is related to the golden ratio.");
        System.out.println("As the numbers increase, the ratio between consecutive Fibonacci numbers ");
        System.out.println("approaches approximately 1.618, known as the golden ratio.");
    }
    
    // Method to run the full program with explanations
    public static void runProgram() {
        printIntroduction();
        printSeparator();
        explainFibonacci();
        printSeparator();
        showExampleUsage();
        printSeparator();
        additionalInfo();
        printSeparator();
    }
    
}  
