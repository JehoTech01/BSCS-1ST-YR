
import java.util.Scanner;


public class jeho2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        String x = scanner.nextLine();
        
        int num = 1;
            try {
            x = Integer.parseInt(num);
            }catch (NumberFormatException e){
                System.out.println("Invalid input. Please enter a valid integer.");
            }
            }

}
