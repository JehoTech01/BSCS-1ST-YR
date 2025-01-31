import javax.swing.JOptionPane;

public class Comprojectf {

    // Main method
    public static void main(String[] args) {
        // Welcome message
        JOptionPane.showMessageDialog(null, "Welcome to the Fibonacci Sequence Calculator!");


        while (true) { // Infinite loop to keep asking the user for input
            
   
        int num1 = -1; // Initialize with a negative value to start the loop

        // Keep prompting until a valid input is received
        while (num1 <= 0) {
            try {
                // Prompt user for input
                String input = JOptionPane.showInputDialog("Enter the desired length of the Fibonacci sequence: ");

                    // Check if the user wants to exit
                    if (input == null || input.trim().equalsIgnoreCase("exit")) {
                        JOptionPane.showMessageDialog(null, "Thank you for using the Fibonacci Sequence Calculator!");
                        System.exit(0); // Exit the program
                    }

                // If the input is blank, treat it as invalid
                if (input == null || input.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                    continue;
                }

                // Convert input to an integer
                num1 = Integer.parseInt(input);

                // Input validation: If the number is not positive
                if (num1 <= 0) {
                    JOptionPane.showMessageDialog(null, "Please enter a positive integer.");
                }

            } catch (NumberFormatException e) {
                // Handle non-integer inputs
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a positive integer.");
            }
        }

        // Continue with Fibonacci sequence logic
        JOptionPane.showMessageDialog(null, "Valid number received: " + num1);
        // Display message about calculation
        JOptionPane.showMessageDialog(null, "Calculating Fibonacci sequence up to " + num1 + " terms...");
        JOptionPane.showMessageDialog(null, "Please wait for a while to calculate the sequence");

        // 2 seconds delay
        try {
            Thread.sleep(2000); // Pause for 2000 milliseconds (2 seconds)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Prepare to collect the Fibonacci sequence
        StringBuilder fibonacciSequence = new StringBuilder("The Fibonacci Sequence is: ");
        for (int n = 0; n < num1; n++) {
            int fibNumber = fibonacciSequence(n); // Calculate Fibonacci number
            fibonacciSequence.append(fibNumber).append(" "); // Append the Fibonacci number
        }

        // Show the entire Fibonacci sequence in one dialog
        JOptionPane.showMessageDialog(null, fibonacciSequence.toString());

        // Closing message
        JOptionPane.showMessageDialog(null, "Thank you for using the Fibonacci Sequence Calculator!");
        System.out.println("Program execution completed. The Fibonacci sequence has been calculated and displayed.\n" + fibonacciSequence);
        System.out.println("Thank You For Using Our Calculator!");
    }
        // Return to the input prompt automatically
}

    // Recursive method to calculate Fibonacci number
    public static int fibonacciSequence(int n) {
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
            return fibonacciSequence(n - 1) + fibonacciSequence(n - 2);
        }
    }
} 
/*Members:
    Jehosue Biscarrra  
    Shem Anniban
    Diego Estacio


    
    NOT INCLUDED
    MICHAEL LOPEZ
*/

