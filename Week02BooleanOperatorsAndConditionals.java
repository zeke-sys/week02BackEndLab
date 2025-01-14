package week02;

public class Week02BooleanOperatorsAndConditionals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ageRequiredToDrive = 16;
		int currentAge = 14;
		boolean canPersonDrive = (currentAge >= ageRequiredToDrive);
		System.out.println("- Can the person drive? " + canPersonDrive);
		
		//if statement
		if (canPersonDrive) {
			System.out.println("- This person can drive.");
		}
		else {
			System.out.println("- This person cannot drive to save their life.");
		}
		
		//cost of eggs (a dozen) and multiple if statements
		double costOfEggs = 2.12;
		int numberOfDozensOfEggsToPurchase = 0;
		
		if (costOfEggs > 3) {
			numberOfDozensOfEggsToPurchase = 1;
		} else if (costOfEggs < 3 && costOfEggs > 2) {
			numberOfDozensOfEggsToPurchase = 2;
		} else if (costOfEggs < 2 && costOfEggs > 1) {
			numberOfDozensOfEggsToPurchase = 3;
		} else {
			numberOfDozensOfEggsToPurchase = 4;
		}
		
		System.out.println("- I will buy " + numberOfDozensOfEggsToPurchase + " dozen eggs please.");
		
		
		//switch Statement - Grade Range Example
		char grade = 'B';
		switch (grade) {
		case 'A':
			System.out.println("- 90-100");
			break;
		case 'B':
			System.out.println("- 80-89");
			break;
		case 'C':
			System.out.println("- 70-79");
			break;
		case 'D':
			System.out.println("- 60-69");
			break;
		default:
			System.out.println("- 0-59");
		}
		
		
		//LOOPS
		/*
		 * While Loop with cup of flower scenario. Worth nothing is that this loop
		 * has the possibility of never running if the Boolean expression evaluates
		 * to false the first time around.
		 */
	
		int cupsOfFlour = 0;
		while (cupsOfFlour < 5) {
			System.out.println("Scooping a cup of flour into the bowl.");
			cupsOfFlour += 1;
			System.out.println("I see " + cupsOfFlour + " cup(s) of flour in the bowl.");
		}
		
		//for Loop
		
		for (int cupsOfSugar = 1; cupsOfSugar <= 5; cupsOfSugar++) { //i++ is essentially the same as i += 1 in the while loop
			System.out.println("Scooping a cup of sugar into the bowl.");
			System.out.println("There are " + cupsOfSugar + " cups of sugar in the bowl");
		}
		
		//another for loop using i
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		//another for loop using a conditional/if statement inside the bracket
		//all numbers less than 100 divisible by 3
		
		for (int i = 0; i < 100; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
		
		
		//one more type of loop
		/*
		 * The do while loop - functions much like the while loop, except that the do while loop 
		 * will always execute at least once, if proven false, since the expression is at the end.
		 */
		
		int cupsOfRice = 10;
		do {
			cupsOfRice++;
			System.out.println(cupsOfRice);
		} while (cupsOfRice < 15);
		 
	}
}


