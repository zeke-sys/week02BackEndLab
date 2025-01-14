package week02;

public class Week02Lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//
		// BOOLEANS and CONDITIONALS:
		//

		// 1. Variable Declaration:
		// a. Create a variable named age and assign it a value of 14
		int age = 14;
		System.out.println(age);

		// 2. Print a Boolean Expression:
		// a. Print the boolean expression age >= 16 to the console and note the
		// results.
		// a. Change the value of age to 18 and print again.
		System.out.println(age >= 16);
		age = 18;
		System.out.println(age >= 16);

		// 3. Can you drive?
		// a. Using a conditional, print one of the following:
		// i. "You can drive" if age is greater than or equal to 16
		// ii. "You cannot drive" otherwise
		//
		// a. Change the value of age and rerun to see the result

		int currentAge = 14;
		int drivingAge = 16;
		boolean hasLicense = false;

		if (currentAge >= drivingAge && !hasLicense) {
			System.out.println("You can drive because you are at or above the driving age of " + drivingAge
					+ ", and you have a license.");
		} else {
			System.out.println("You cannot drive because you are under the age of " + drivingAge
					+ ", and you don't have a license.");
		}

		// 4. Update Solution to Question 3 as follows:
		// a. Add a new variable called hasLicense before the conditional.
		// b. Change the boolean expression in the conditional to additionally
		// include the need for hasLicense to be true.
		// c. Try changing the values of age and hasLicense and note the different
		// results.

		System.out.println("See above.");

		// 5. Milk?
		// a. Create two new variables - costOfMilk and thirstLevel
		// b. Create a new conditional that prints "Milk Please" if costOfMilk is less
		// than 2.50
		// or if thirstLevel is greater than 6 and prints "No Thanks" otherwise.
		// c. Change the values and note the different results.

		double costOfMilk = 5.00;
		int thirstLevel = 3;

		if (costOfMilk < 2.50 || thirstLevel > 6) {
			System.out.println("Milk Please");
		} else {
			System.out.println("No Thanks");
		}

		// 6. Cookie Distribution:
		// Note: You will evenly distribute all of the cookies to the children
		// and as the adult you get to keep the remaining cookies for yourself.
		//
		// a. Create two variables called numberOfCookies and numberOfChildren.
		// b. Initialize the two variables to integer values.
		// b. Use a conditional to print the following based on the following
		// conditions:
		// i. If there are 0 cookies remaining, print "Sad Face"
		// ii. If there are less than 2 cookies, print "Yes!"
		// iii. If there are less than 5 cookies, print "Whoohoooo!"
		// iv. If there are 5 or more cookies, print "Jackpot!"

		int numberOfCookies = 10;
		int numberOfChildren = 7;

		if (numberOfCookies - numberOfChildren == 0) {
			System.out.println("Sad Face");
		} else if (numberOfCookies - numberOfChildren < 2) {
			System.out.println("Yes");
		} else if (numberOfCookies - numberOfChildren < 5) {
			System.out.println("Whoohoooo!");
		} else if (numberOfCookies - numberOfChildren >= 5) {
			System.out.println("Jackpot!");
		}

		// 7. Loyalty Member Program:
		// a. Create a variable called loyaltyMemberStatus and assign the value "SILVER"
		// b. Create a variable called loyaltyMemberDiscount and assign the value 0.0
		// c. Using a switch, set the value of loyaltyMemberDiscount based on
		// the following loyaltyMemberStatus scale:
		// i. "SILVER" is 0.10
		// ii. "GOLD" is 0.15
		// iii. "PLATINUM" is 0.25

		String loyaltyMemberStatus = "GOLD";
		double loyaltyMemberDiscount = 0.0;

		switch (loyaltyMemberStatus) {
		case "SILVER":
			loyaltyMemberDiscount = 0.10;
			break;
		case "GOLD":
			loyaltyMemberDiscount = 0.15;
			break;
		case "PLATINUM":
			loyaltyMemberDiscount = 0.25;
			break;
		default:
			loyaltyMemberDiscount = 0.0;
			break;
		}

		System.out.println("Loyalty Member Status: " + loyaltyMemberStatus);
		System.out.println("Loyalty Member Discount: " + (loyaltyMemberDiscount * 100) + "%");

		// 8. Using the Loyalty Member Program variables from Question 7, do the
		// following:
		// a. Create a variable called billTotal and assign a value
		// b. Create a variable called adjustedTotal and assign it the billTotal minus
		// the loyaltyMemberDiscount percent of the billTotal
		// c. If the adjustedBillTotal is greater than $500 upgrade the
		// loyaltyMemberStatus from SILVER to GOLD or from GOLD to PLATINUM

		double billTotal = 800; // example bill total
		double adjustedBillTotal = billTotal * (1 - loyaltyMemberDiscount);

		if (adjustedBillTotal > 500) {
			if (loyaltyMemberStatus.equals("SILVER")) { // nested if statement
				loyaltyMemberStatus = "GOLD";
			} else if (loyaltyMemberStatus.equals("GOLD")) {
				loyaltyMemberStatus = "PLATINUM";
			}
			System.out
					.println("Congratulations! Your loyalty status has been upgraded to: " + loyaltyMemberStatus + ".");
		} else { // end of if statement
			System.out.println("Thank you for being a loyal member!");
		} // end of else statement

		// 9. Login -- username & password:
		// a. Create two variables, username and password
		// b. Create a conditional that prints one of the following:
		// i. "login successful" if the username is "Tommy123" and the password is
		// "12345"
		// ii. "access denied" otherwise

		final String username = "Tommy123";
		final String password = "12345";

		if (username.equals("Tommy123") && password.equals("12345")) {
			System.out.println("Login successful!");
		} else {
			System.out.println("Access denied!");
		}

		//
		// LOOPS:
		//

		// 10. Write a for loop that prints each number from 0 to 9

		int i = 0;
		for (i = 0; i <= 9; i++) {
			System.out.println(i);
		}

		// 11. Write a for loop that prints each number from 10 to 0 backwards

		for (int x = 10; x >= 0; x--) {
			System.out.println(x);
		}

		// 12. Write a for loop that prints every other number from 0 to 100

		for (int y = 0; y <= 100; y += 2) {
			// if (y % 2 == 0) { //this formula shows all numbers divisible by 2 which gets
			// the answer but not necessarily how to go about it
			System.out.println("- " + y);
			// }
		}

		// 13. Write a for loop that iterates from 0 to 100 and prints
		// "EVEN" if the number is even and "ODD" if it's odd

		for (int z = 0; z <= 100; z++) {
			if (z % 2 == 0) {
				System.out.println(z + " - EVEN");
			} else {
				System.out.println(z + " - ODD");
			}
		}

		// 14. Write a while loop that starts at 100 and iterates backwards by 1 until
		// it reaches 0
		// within the loop, divide each number by 3 and print the remainder to the
		// console.

		int q = 100;
		while (q >= 0) {
			System.out.println("Number: " + q + "; Remainder when divided by 3: " + (q % 3));
			q--;
		}

		// Determine whether the console will read True or False
		System.out.println("hello world".charAt(0) != 'H');

		// Find the second character in the following phrase

		String firstProject = "Hello World!";
		char indexLetter = firstProject.charAt(1); // Can do it like this to see the steps or in line with the console
													// print

		System.out.println(indexLetter);

		// Switch statement using days of the week

		String dayOfWeek = "Wednesday";

		switch (dayOfWeek) {
		case "Monday":
			System.out.println("- It's Monday! Time to start the week.");
			break;
		case "Friday":
			System.out.println("- Yay, it's Friday! Time to celebrate the weekend.");
			break;
		case "Saturday":
		case "Sunday":
			System.out.println("- It's the weekend. Enjoy!");
			break;
		default:
			System.out.println("- It's a weekday. Keep working hard.");
		}

		// Switch statement using vehicle size to rent scenario

		int numberOfPeople = 9;
		System.out.println("What type of vehicle should we rent with " + numberOfPeople + " people?");

		switch (numberOfPeople) {
		case (1):
		case (2):
			System.out.println("A motorcycle, a convertible, or a sports car!");
			break;
		case (3):
		case (4):
		case (5):
			System.out.println("A sedan might be a good choice.");
			break;
		case (6):
		case (7):
			System.out.println("An SUV or a minivan.");
			break;
		default:
			System.out.println("A large van or maybe a bus?");
		}

		// All upper case or All lower case

		String str = "hello, world!";
		String upperStr = str.toUpperCase();

		System.out.println(upperStr); // Output: "HELLO, WORLD!"

		// What Day is it?

		String day = "Monday";

		switch (day.toLowerCase()) { // to account for inputs with lower or upper cases
		case "monday":
		case "tuesday":
		case "wednesday":
		case "thursday":
		case "friday":
			System.out.println(day + " is a weekday.");
			break;
		case "saturday":
		case "sunday":
			System.out.println(day + " is a weekend day.");
			break;
		default:
			System.out.println("Invalid day!");
		}

		// for loop - write a for loop that increments the counter by the amount stored
		// in the variable userValue declared in Java

		int userValue = 20;
		int f = 0;
		for (f = 1; f <= 100; f += userValue) {
			System.out.println(f);
		}

		/*
		 * Given variables power, base, and result, use a for loop to raise the base to
		 * the power of power (i.e. base^power). The loop should run from 1 to the
		 * number stored in power In the loop body, result should be multiplied by the
		 * base every time the loop iterates and that value stored in result, like this:
		 * result *= base or result = result * base Print the value of result to the
		 * console
		 */

		int power = 4;
		int base = 5;
		int result = 1;
		int g;

		for (g = 1; g <= power; g++) {
			result = (int) Math.pow(base, power); // another way to do this is result *= base or result = result * base
		}
		System.out.println(g);
		System.out.println(base + " raised to the power of " + power + " is: " + result);

		// what will be the value of the variable counter when the following for loop
		// finishes running
		int counter = 0;
		for (int p = 1; p < 100; p += 2) {
			counter++;
			System.out.println(counter); // since the loop is incrementing by 2, then it will take 50 iterations to
											// reach 99
		}

		// while loop

		int r = 1; // initialization
		while (r <= 5) {
			System.out.println(r);
			r++; // iteration
		}
		System.out.println("Done!");

		// Multiplication table for loop

		int j = 0;
		for (j = 1; j <= 10; j++) {
			System.out.println("1 x " + j + " = " + (1 * j));
		}

		// Add a Number a Certain Number of Times

		int numToAdd = 8;
		int howManyTimes = 3;
		int sumResult = 0;
		;
		int l = 1;

		do {
			l++;
			sumResult += numToAdd;
		} while (l <= howManyTimes);

		System.out.println("The result is " + sumResult);

		int userNumber = 14;

		if (userNumber > 10 && userNumber < 100) {
			do {
				System.out.println(userNumber);
				userNumber--;
			} while (userNumber >= 10);
		} else {
			System.out.println("Your number is not a value that is more than 10 and less than 100.");
		}

		int x = 1;
		do {
			System.out.println("I will print!");
		} while (x > 1);

		// CountDown but with a number between 10 and 3

		int countDown = 10;
		if (countDown >= 3 && countDown <= 10) {
			while (countDown >= 1) {
				System.out.println(countDown + "...");
				countDown--;
			}
			System.out.println("We have lift off!");
		} else {
			System.out.println("We have lift off!");
		}

		// do while loop using length ()

		/*
		 * Given the variable userWord and wordLength, create a do while loop that
		 * prints the word stored in userWord. Declare a variable called counter and set
		 * it equal to wordLength, use counter to keep track of the count If wordLength
		 * is less than 5 characters, then print userWord to the console 1 time If the
		 * word is 5 or more characters long, then print userWord to the console
		 * wordLength number of times This is how it should work: if userWord is
		 * "Loops", then wordLength would equal 5 and so "Loops" would print 5 times. If
		 * the word is "Java", then "Java" would only print 1 time because wordLength
		 * would be less than 5.
		 * 
		 */

		String userWord = "develop";
		int wordLength = userWord.length();

		System.out.println(wordLength);
		int wordCount = wordLength; // using the variable wordCount instead of counter
		int s = 1;

		if (wordLength < 5) {
			System.out.println(userWord);
		} else {
			do {
				s++;
				System.out.println(userWord);
			} while (s <= wordCount);
		}
		
		
		//Concatenate A String its Length Number of Times
		
		
		String thisWord = "Where";
		String longString = "";
		
		for (i = 1; i <= thisWord.length(); i++) {
			longString += thisWord;
		} 
		
		System.out.println(longString);
		
		
		//finding odd numbers in for loop
		
		for (int index = 0; index <= 100; index++) {
			if (!(index % 2 == 0)) {
				System.out.println(index);
			}
		}
		
		
		//weekend and summer scenario 
		int thisDay = 6;
		int thisMonth = 4;
		
		boolean isSummer = thisMonth >= 6 && thisMonth <= 8;
		boolean isWeekday = thisDay < 6;
		
		if (isSummer || !isWeekday) {
			System.out.println("Definitely going to sleep in!");
		} else {
			System.out.println("Probably need to wake up at a decent time.");
		}
		
		
		
		for (int t = 10; t > 0; t--) {
			System.out.println(t);
		}
		
		
		
		

	}

}
