import javax.swing.JOptionPane;
public class joptiontry {
     public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello "+ name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you "+ name +"?"));
         if (age < 0) {
                System.out.print("Invalid birth date!");
            } else if (age < 18) {
                System.out.print("You are a minor.");
            } else if (age >= 18 && age < 65) {
                System.out.print("You are an adult.");
            } else {
                System.out.print("You are a senior.");
            }
        JOptionPane.showMessageDialog(null, "Ahhh so your "+ age);

        String nickname = (JOptionPane.showInputDialog("So what's your Nickname?"));
        JOptionPane.showMessageDialog(null, "Ohhh hi  "+ nickname);

        String hobby = (JOptionPane.showInputDialog("So what's your Hobby "+ nickname+ "?"));
        JOptionPane.showMessageDialog(null, "So your hobby is "+ hobby);

        String sport = (JOptionPane.showInputDialog("What about your sport?"));
        JOptionPane.showMessageDialog(null, "Ohh your sport "+ sport +" what a nice sport");

         double height = Double.parseDouble(JOptionPane.showInputDialog("So how tall are you? "));
         String message;

         if (height < 160) {
            message = "You are small.";
         } else if (height >= 170) {
            message = "You are tall.";
         } else {
            message = "You have an average height.";
         }
         JOptionPane.showMessageDialog(null, "You are " + height + "cm tall! " + message);

         String job = JOptionPane.showInputDialog("What is your dream job?" + nickname);
         JOptionPane.showMessageDialog(null, "Ahhh so you want to be a " + job);

         double salary = Double.parseDouble(JOptionPane.showInputDialog("How much is your current salary?"));
         
         String salary1;
         if (salary < 2000){
            salary1 = "Your salary is quietly low";
         } else if (salary >= 2000){
            salary1 = ("Your salary is high");
         }else {
            salary1 = "You have average salary";
         }
         JOptionPane.showMessageDialog(null, "Ohhh your salary is. "+ salary + salary1);
       String noodles = JOptionPane.showInputDialog("How many noodles do you have right now?");
        String noodlesMessage;

        try {
            int noodleCount = Integer.parseInt(noodles);
            
            if (noodleCount < 10) {
                noodlesMessage = "You have fewer than 10 noodles.";
            } else {
                noodlesMessage = "You have 10 or more noodles.";
            }

        } catch (NumberFormatException e) {
            noodlesMessage = "Please enter a valid number of noodles.";
            return;
        }

        // Show results
        JOptionPane.showMessageDialog(null, noodlesMessage);

        String computer = JOptionPane.showInputDialog("Do you have pc?: ");
        
        switch (computer) {
            case "Yes", "yes":
               JOptionPane.showMessageDialog(null, "Ohh nice");
                break;
            case "No", "no":
               JOptionPane.showMessageDialog(null, "Ohh so sad you should buy a one");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid Input!");
        }
        
     }
    
}
