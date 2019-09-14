import java.util.Scanner;

public class WhatToEat {

	public static void main(String[] args) {
		
		int eventType;
		int partySize;
		String result;
		String prepType;
		String mealType;
		String eventTypeNew;
		
	
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Hello! Let me help you with your dinner plans!");
		System.out.println("What type of event is this? Is it:");
		System.out.println("1 - Casual \n2 - Semi-formal \n3 - Formal\n");
		
		eventType = scnr.nextInt();
		eventTypeNew = "";
		mealType = "";
		prepType = "";
		
		
		System.out.println("Awesome! For how many people?");
		
		partySize = scnr.nextInt();
		
		if (partySize == 1 && partySize > 0)   {  //decides prep time based on number of people
			prepType = "in the micreowave!";
		}
		else if (partySize > 1 && partySize < 13)   {
			prepType = "in your kitchen!";
		}
		else   {
			prepType = "by a caterer!";
		}
		
		switch (eventType)   {               //changing user input back to a word and choosing meal type
		case 1:
			eventTypeNew = "casual";
			mealType = "sandwiches";
			break;
		
		case 2:
			eventTypeNew = "semi-formal";
			mealType = "fried chicken";
			break;
		
		case 3:
			eventTypeNew = "formal";
			mealType = "chicken parmesan";
			break;
		}
		
		
		
		result = "Since you’re hosting a " + eventTypeNew + " event for " + partySize +
				" people, I suggest you serve " + mealType + " prepared " + prepType;
		
		System.out.println(result);



	}

}
