import java.util.Scanner;

public class jehounsolved {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        String input = scanner.nextLine();

        // Convert the input to an integer
        int num;
        try {
            num = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            return;
        }

        // Compare the number with 100
        if (num > 100) {
            System.out.println("The number you entered is higher than 100");
        } else if (num < 100) {
            System.out.println("The number you entered is lower than 100");
        }
        scanner.close();
    }
}
