import java.util.Scanner;
public class Jeho{
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
			
		System.out.print("Enter your Name: ");
			String name = scanner.nextLine();
			
		System.out.print("Enter your Nickname: ");
			String nickname = scanner.nextLine();
			
		System.out.print("Where are Your From?: ");
			String address = scanner.nextLine();
			
		System.out.print("How old Are you now?: " );
			String age = scanner.nextLine();
		
		System.out.print("What college are you in right now?: ");
			String college = scanner.nextLine();
			
		System.out.print("What is your hobby?: ");
			String hobby = scanner.nextLine();
		
		System.out.print("Your Birthday?: ");
			String birthday = scanner.nextLine();
		
		System.out.print("What is your Sport?: ");
			String sport = scanner.nextLine();
			
		System.out.println("Here's your info you entered: ");
		String out = name + nickname + address + age + college + hobby + birthday + sport;
		
		System.out.println(out);
		
		
		
		System.out.print ("Enter your email so we can contact you: ");
			String email = scanner.nextLine();
		System.out.println ("Thank You for your cooperation " + name);
			
		
			
			scanner.close();
			
			
			
		
		
			
}
}