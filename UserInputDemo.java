package week02;

/*import java.util.*; //to receive user input in Java, we can use Scanner object. It's in java.util, so we import it
public class UserInputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.in is a standard input stream
		
		boolean loggedIn = false;
		Scanner sc = new Scanner (System.in);
		while (!loggedIn) {
			System.out.print("Enter username: ");
			String userName = sc.nextLine();
			System.out.print("Enter password: ");
			String password = sc.nextLine();
			
			if (userName.equals("samy123") && password.equals("12345")) {
				System.out.println("Welcome back " + userName + "!");
				loggedIn = true;
			} else {
				System.out.println("Inaccurate credentials!");
			} //end of else
			
		} //end of while
	} //end of main

}*/ //end of userInputDemo class1 //Commented out to run code below and additional scenario

	/*
	 Add a login attempt count that would enable the user to only enter the
	 incorrect credentials a certain number of times before displaying
	 a message like "You are locked out!" and ending the loop.
	 * */

	import java.util.*;
	public class UserInputDemo {
		public static void main(String[] args) {
			Scanner sc = new Scanner (System.in); //System.in is a standard input stream
			
			//Predefined userName and password so we can change as we please
			final String userName = "samy123";
			final String password = "12345";
			
			int attemptCount = 0;
			final int maxAttempts = 3;
			
			while (attemptCount < maxAttempts) {
				System.out.print("Enter username: ");
				String inputUsername = sc.nextLine();
				
				System.out.print("Enter password: ");
				String inputPassword = sc.nextLine();
				
				if (inputUsername.equals(userName) && inputPassword.equals(password)) {
					System.out.println("Welcome back, " + inputUsername + "!");
					break;
				} else {
					attemptCount++;
					System.out.println("Inaccurate Credentials. Attempt " + attemptCount + " of " + maxAttempts + ".");
					
					if (attemptCount == maxAttempts) {
						System.out.println("You are locked out.");
					}
				} //end of else statement
			} //end of while
			
			sc.close();
			
			
		} //end of main
	} //end of class
