import java.time.LocalDate;
import java.util.Scanner;

public class agecalculator {
    
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter your birth year (YYYY): ");
            int birthYear = scanner.nextInt();
            
            System.out.println("Enter your birth month (1-12): ");
            int birthMonth = scanner.nextInt();
            
            System.out.println("Enter your birth day (1-31): ");
            int birthDay = scanner.nextInt();
            
            LocalDate today = LocalDate.now();
            LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
            
            int age = today.getYear() - birthDate.getYear();
            
            // Check if the birthday hasn't occurred yet this year
            if (today.getMonthValue() < birthMonth ||
                    (today.getMonthValue() == birthMonth && today.getDayOfMonth() < birthDay)) {
                age--;
            }
            
            System.out.println("Your age is: " + age);
            
            // Example usage of logical operators
            if (age < 0) {
                System.out.println("Invalid birth date!");
            } else if (age < 18) {
                System.out.println("You are a minor.");
            } else if (age >= 18 && age < 65) {
                System.out.println("You are an adult.");
            } else {
                System.out.println("You are a senior.");
            }
            
            // Using ! operator
            if (!(age < 0)) {
                System.out.println("Thank you for using the age calculator!");
            }
        }
    }
}

        
