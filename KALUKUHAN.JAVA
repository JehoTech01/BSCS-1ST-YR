import javax.swing.JOptionPane;

public class Comproject2 {

    // Main method
    public static void main(String[] args) {
        // Scanner object for user input

        
        
        // Welcome message
        JOptionPane.showMessageDialog(null, "Welcome to the Fibonacci Sequence Calculator!");
     
        
     int num1 = -1; // Initialize with a negative value to start the loop

        // Keep prompting until a valid input is received
        while (num1 <= 0) {
            try {
                // Prompt user for input
                String input = JOptionPane.showInputDialog("Enter the desired length of the Fibonacci sequence: ");

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
        // You can now proceed with generating the Fibonacci sequence

        // Display message about calculation
        JOptionPane.showMessageDialog(null, ("Calculating Fibonacci sequence up to "  + num1 + " terms..."));
        JOptionPane.showMessageDialog(null, "Please Wait for a while to calculate the sequence");

        //2 seconds delay
        try {
            Thread.sleep(2000); // Pause for 2000 milliseconds (2 seconds)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println();

        // Print the Fibonacci sequence
        // Prepare to collect the Fibonacci sequence
        JOptionPane.showMessageDialog(null,"Calculation complete. ");
        StringBuilder fibonacciSequence = new StringBuilder("The Fibonacci Sequence is: ");

        JOptionPane.showMessageDialog(null, "Can I Court You Again?");

        // Loop to display progressively larger dialogs with larger text
        int size = 1; // Initial multiplier for dialog size
        for (int i = 1; i <= 4; i++) {
            // Adjust text size using HTML
            String message = "<html><body style='font-size:" + (20 * size) + "px;'>Can I?</body></html>";

            // Build the option pane for adjustable size
            JOptionPane optionPane = new JOptionPane(
                message,
                JOptionPane.PLAIN_MESSAGE,
                JOptionPane.DEFAULT_OPTION,
                null,
                new Object[] {} // No buttons
            );

            // Create and customize the dialog
            javax.swing.JDialog dialog = optionPane.createDialog(null, "Message");
            dialog.setSize(200 * size, 100 * size); // Adjust dialog size
            dialog.setVisible(true);

            // Increment size for the next dialog
            size++;
        }
}
}


