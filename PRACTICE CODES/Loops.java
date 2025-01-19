import java.security.DrbgParameters;
import java.util.Scanner;




public class Loops {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    /*WHILE LOOP
    int i = 1;
    while (i <= 5) {
        System.out.println("Count: " + i);
        i++;
    }
  */


/*FOR LOOP
  for (int i = 1; i <= 5; i++) {
    System.out.println("Count: " + i);
}*/
/* FOR LOOP
    for(int i = 1; i <=5; i++){
    System.out.println(i);
      
    }
*/
/* SIMPLE CALCULATOR USING SWITHCES IN JAVA
while (true) { 
    


    System.out.println("Enter First Number: ");
    double num1 = scanner.nextDouble();
    System.out.println("Enter Second Number:");
    double num2 = scanner.nextDouble();
    System.out.println("Choose Operations(+,-, * / ): ");
    char operation = scanner.next().charAt(0);

    double result;
    switch (operation) {
        case '+':
          result = num1 + num2;
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

    System.out.print(result +"\n");
  }
       */
      /* 
      for (int i = 1; i <= 2; i++) {
    for (int j = 1; j <= 3; j++) {
      System.out.print(i + "," + j + " ");
    }
  }
  */

  for (int i = 0; i < 2; i++) {
    for (int j = 0; j < 3; j++) {
      System.out.print(i+" " + j+ " ");
        
    }
      
  }



  }

  }

