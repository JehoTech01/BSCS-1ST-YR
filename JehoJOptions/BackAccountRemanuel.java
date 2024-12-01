import java.io.*;
public class BackAccountRemanuel{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       /*  1.  int num; 
         
        System.out.println("Enter a Number: ");
        num = Integer.parseInt(br.readLine());

        if (num >= 10){
            System.out.println("Your number is greater than 10");
        }else{
            System.out.println("Your Number is Less Than 10");
            
        }*/

        /*  2. int  num1, num2;
            System.out.println("Enter a first number: ");
            num1= Integer.parseInt(br.readLine ());
            System.out.println("Enter a second number: ");
            num2= Integer.parseInt(br.readLine ());

        if (num1 > num2){
            System.out.println("The First number is greater than the Second  Number");
        }else{
            System.out.println("The Second number is greater than the First Number ");
        }*/

        /*  3. int num;
        
         System.out.println("Enter a Number: ");
        num = Integer.parseInt(br.readLine());

        if (num % 3 == 0 ){
            System.out.println("The Number is divisible  by 3");
        }else{
            System.out.println("The number is Not divisible by 3");
        }*/

        /*  4. int num;
        
         System.out.println("Enter your height in CM: ");
        num = Integer.parseInt(br.readLine());

        if (num >= 150 ){
            System.out.println("You are Tall");
        }else{
            System.out.println("You are Short");
        }*/

       /* 19.  int num;
        System.out.println("Enter a Year: ");
        num = Integer.parseInt(br.readLine());

        if (num % 100 == 0 ){
            System.out.println("Century year");
        }else{
            System.out.println("Not a Century Year");
        }*/

        /* 20. int num;
        System.out.println("Enter a month: ");
        num = Integer.parseInt(br.readLine());

        switch (num) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("Feburaby");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("Jully");
            case 8 -> System.out.println("Augost");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("Feburaby");
            case 11 -> System.out.println("October");
            case 12 -> System.out.println("December");

            default -> {
            }
        }*/

       /*  18.  int num;
        System.out.println("Enter You're Hight in Inch: ");
        num = Integer.parseInt(br.readLine());
        if (num >= 72){
            System.out.println("Tall");
        }else if (num <=71 && num >= 61){
            System.out.println("Average");
        }else {
            System.out.println("Sort");
        }*/

         /* 17. int num;
        System.out.println("Enter a day in a Number: ");
        num = Integer.parseInt(br.readLine());

        switch (num) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Weds");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }*/

        /* 16. int num;
        System.out.println("Enter a Number 1-7: ");
        num = Integer.parseInt(br.readLine());

        if (num >=1 && num <=5 ){
            System.out.println("Weekdays");
        }else{
            System.out.println("Weekends");
        }*/

        int num1,num2;

        System.out.println("Enter a First Number: ");
        num1 = Integer.parseInt (br.readLine());
         System.out.println("Enter a second Number: ");
        num2 = Integer.parseInt (br.readLine());

        if (num1 % 2 ==0 && num1 % 3 == 0 || num2 % 2 == 0 && num2 % 3 == 0){
            System.out.println("both Number are divisible by 2 and 3");
        }
    }
}