
import java.util.Scanner;

public class calculator1{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter Second Number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Choose an Operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        double result;
        switch (operation) {
            case '+':
               result =  num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;     
                break;
            default:
            System.out.println("Invalid Operation!");
                return;
        }
        System.out.println(result);
    }
}