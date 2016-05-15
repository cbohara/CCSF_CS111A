//********************************************************************************
//Hwk9.java	This program will manipulate two strings
//Inputs: 	string1, string2, char1, position
//Outputs: 	comparison of string1 and string2, upper case string1, lower case
//		string2, number of characters in string1, first character in
//		string2, number of occurances char1 is in string2, the character
//		that is in position of string1
//Written by:	Charlie O'Hara
//Modified:	November 1, 2015
//********************************************************************************
import java.util.Scanner;

public class Hwk9
{
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		
		//get first name
		System.out.print("Enter your first name: ");
		String string1 = stdin.nextLine();

		//get last name
		System.out.print("Enter your last name: ");
		String string2 = stdin.nextLine();

		//get integer
		System.out.print("Please enter an integer to represent a character\n"
				+ "position within your first name: ");
		int pos = stdin.nextInt();
		
		//determine if string1 is less, greater, or equal to string2
		if (string1.compareTo(string2) < 0)
		{
			System.out.println(string1 + " is less than " 
						+ string2 + ".");
		}
		else if (string1.compareTo(string2) > 0)
		{
			System.out.println(string1 + " is greater than "
						+ string2 + ".");
		}
		else
		{
			System.out.println(string2 + " is equal to " 
						+ string2 + ".");
		}

		//string1 in upper case
		String upper = string1.toUpperCase();
		System.out.println("Your first name in upper case is " 
						+ upper + ".");
	
		//string2 in lower case
		String lower = string2.toLowerCase();
		System.out.println("Your last name in lower case is " 
						+ lower + ".");

		//number of characters in string1
		int stringSize = string1.length();
		System.out.println("Your first name is " + stringSize 
						+ " characters long.");

		//first character in string2
		char letter = string2.charAt(0);
		System.out.println("The first letter in your last name is " 
					 	+ letter + ".");

		//the number of occurrences that char1 is contained in string1
		//char1 is the first character in string1
		char char1;
		char1 = string1.charAt(0);
		int total = countOccurences(string1, char1);
		
		//display character of a certain position in string1
		char positionChar = showChar(string1, pos);
		System.out.println(charAtPosition + " is located at position " 
					+ pos + ".");
		
		System.exit(0);
	}

	//the number of occurrences that char1 is contained in string1
	public static int countOccurences(String string1, char char1)
	{
		//accumulator
		int count = 0;

		//number of characters in string1
		int stringSize = string1.length();

		//if char1 appears in an iteration, the count will increase by one
		for (int i = 0; i < stringSize; i++)
		{
			if (string1.charAt(i) == char1)
			{
				count++;
			}
		}
		//display results
		System.out.println(char1 + " occurs in " + string1 
					+ " " + count + " time(s).");
		
		//return results
		int countOccurences = count;
		return countOccurences;
	}

	//display character of a certain position in string1
	public static void showChar(String string1, int pos)
	{
		char charAtPosition = string1.charAt(pos);
		char showChar = charAtPosition;
		return showChar;		
	}
}