import javax.swing.JOptionPane;
public class FiboCalcu {
	
	// method for calculating the fibonacci sequence
	public static int fibo(int n, int first, int second) {
        if (n == 0) {
            return first;
        } else if (n == 1) {
            return second; 
        } else { 
            return fibo(n - 1, second, first + second);
        }
    }
	
	//method to print the sequence
	public static void printFibo(int length, int start) {
        int first = start;
        int second = start ;
        String sequence = "";

        for (int i = 0; i < length; i++) {
            sequence += fibo(i, first, second) + " ";
            }
        
        JOptionPane.showMessageDialog(null, "Fibonacci sequence: " + sequence);

	}

	public static void main(String[] args) {
        int repeat = 1;
       
        JOptionPane.showMessageDialog(null, "Fibonacci Sequence Calculator");
        
        while (repeat == 1) {
            // ask user for input
            String lengthStr = JOptionPane.showInputDialog("Enter the length of the Fibonacci sequence:");
            int length = Integer.parseInt(lengthStr);

            String startStr = JOptionPane.showInputDialog("Enter the starting number for the Fibonacci sequence:");
            int start = Integer.parseInt(startStr);

            // print 
            printFibo(length, start);
            
            //ask to do another one
            int response = JOptionPane.showConfirmDialog(null, "Would you like to input again?", "Continue?", JOptionPane.YES_NO_OPTION);

            if (response == JOptionPane.NO_OPTION) {
                repeat = 0;
            }
        }

        // goodbye
        JOptionPane.showMessageDialog(null, "Thank you for using the program!");
    }


}

	
        
