import java.util.Scanner;
public class jeho1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        String Number = scanner.nextLine();

        int num = 100;
                try {
            num = Integer.parseInt(Number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            return;
        }
        
        if (num > 100 ){
        System.out.println("The number you entered is higher than 100");

        } else if (num < 100) {
        System.out.println("The number you entered is lower than 100");
        }
        scanner.close();
        
    
        



    }
}