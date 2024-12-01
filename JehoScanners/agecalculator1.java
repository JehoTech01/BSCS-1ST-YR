
import java.time.LocalDate;
import java.util.Scanner;

public class agecalculator1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Birthyear(Ex. 2006): ");
        int birthYear = scanner.nextInt();

        System.out.println("Enter your Birthmonth(Ex. 04): ");
        int birthMonth = scanner.nextInt();

        System.out.println("Enter your Birhtdate(15): ");
        int birthDate = scanner.nextInt();

        LocalDate today = LocalDate.now();
        LocalDate birthDay = LocalDate.of(birthYear, birthMonth, birthDate);

        int age = today.getYear() - birthDay.getYear();
        if (today.getMonthValue() < birthMonth ||
                    (today.getMonthValue() == birthMonth && today.getDayOfMonth() < birthDate)) {
                age--;
            }

        System.out.println("Your age is: "+age);

        if (age > 60){
            System.out.println("You are a Senior!");
        } else if (age >= 18){
            System.out.println("You are Adult!");
        }else if (age < 18){
            System.out.println("You are a Minor!");
        }else if (age < 0){
            System.out.println("You havent't Born yet!");


        }

        
    }
}
