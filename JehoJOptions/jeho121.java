import java.util.Scanner;
import javax.swing.JOptionPane;


public class jeho121 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = "";

                while(name.isBlank()){
        System.out.println("Enter your Name: ");
        name = scanner.nextLine();
        }

        int age = -1;
                while(age < 0){
        System.out.println("Enter your Age: ");
        age = scanner.nextInt();
        scanner.nextLine();
        }

        String nickname1 = "";
                while(nickname1.isBlank()){
        System.out.println("Enter your Nickname: ");
        nickname1 = scanner.nextLine();
        }

        String hobby = "";
                while(hobby.isBlank()){
        System.out.println("Enter your Hobby: ");
        hobby = scanner.nextLine();
        }

        String sport = "";
                while(sport.isBlank()){
        System.out.println("Enter your Sport: ");
        sport = scanner.nextLine();
        }

        int height = 1;
                while(height < 1){
        System.out.println("Enter your Height: ");
        height = scanner.nextInt();
        }

        int birthday = -1;
                while(birthday < -1){
        System.out.println("Enter your Birthday: ");
        birthday = scanner.nextInt();
        }

        String color = "";
                while(color.isBlank()){
        System.out.println("Enter your favorite color: ");
        color = scanner.nextLine();
        }

        System.out.println("Hello "+ name +" here's the infos you entered:");
        System.out.println("Your name is: " + name + 
        "\nYour age is: " + age + "\nYour Nickname is: " + 
        nickname1+ "\nYour Hobby is: " + hobby + 
        "\nYour Sport is: " + sport + "\nYour Favorite color is: "+ color);
        
        String name1 = JOptionPane.showInputDialog("So now Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name1);
        scanner.close(); 
        //JOPTIONPANE
        //JOPTIONPANE
        //JOPTIONPANE
        //JOPTIONPANE





        
    }
}
