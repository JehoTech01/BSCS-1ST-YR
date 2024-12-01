import javax.swing.JOptionPane;

public class JOption {

    public JOption() {
    }
    public static void main (String[] args) {
    	
    	String name = JOptionPane.showInputDialog("Enter your name");
    	String email = JOptionPane.showInputDialog("Enter your email");
    	String address = JOptionPane.showInputDialog("Enter your address");
    	int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you "+ name +"?"));
    	String sex = JOptionPane.showInputDialog("Enter your sex M/F");
    	String status = JOptionPane.showInputDialog("Enter your status Single/Married");
    	
    	
    	JOptionPane.showMessageDialog(null, "Your name is  "+ name);
		JOptionPane.showMessageDialog(null, "Your email is  "+ email);
		JOptionPane.showMessageDialog(null, "Your address is  "+ address);
		
         if (age < 0) {
                JOptionPane.showMessageDialog(null, "Invalid age  ");
            } else if (age < 18) {
                JOptionPane.showMessageDialog(null, "You are minor  ");
            } else if (age >= 18 && age < 65) {
                JOptionPane.showMessageDialog(null, "You are an legal age ");
            } else {
                JOptionPane.showMessageDialog(null, "You are senio");
            }
		JOptionPane.showMessageDialog(null, "Your sex is  "+ sex);
		JOptionPane.showMessageDialog(null, "Your status is  "+ status);
		
		
		System.out.println("Your name is  "+ name);
		System.out.println("Your email is  "+ email);
		System.out.println("Your address is  "+ address);
		System.out.println("Your age is  "+ age);
		if (age < 0) {
                System.out.println("Invalid age ");
            } else if (age < 18) {
                System.out.println("You are a minor.");
            } else if (age >= 18 && age < 65) {
                System.out.println("You are an legal age");
            } else {
                System.out.println("You are a senior.");
            }
		System.out.println("Your sex is  "+ sex);
		System.out.println("Your status is  "+ status);
		

    	

    	
}
    
    
}