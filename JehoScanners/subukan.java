import java.util.Scanner;
public class subukan {
    public static void main(String[] args) {
        System.out.print("How old are you?: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int age  = 18;
        try {
            age = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid age");
                return;
        }
         if ( age >= 100){
            System.out.println("You veteran");
        }else if (age >= 60){
            System.out.println("You are Senior");
        }else if (age >= 18){
            System.out.println("You are a Adult");
        }else if (age <= 0){
            System.out.println("You haven't born yet");
        }else{
            System.out.println("You're a Minor");
            System.out.println("You are not allowed to enter");
            
        }
        scanner.close();
    }
    
}
