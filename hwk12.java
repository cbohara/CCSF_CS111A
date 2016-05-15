//********************************************************************************
//Hwk12.java	This program will search an unsorted list of 20 integers, return
//		the number of times a user specified searchValue is found, and
//		display the position of the first occurence.	
//Inputs: 	unsorted list of 20 integers	
//Outputs: 	number of times the searchValue is found, first occurance position
//Written by:	Charlie O'Hara
//Modified:	November 19, 2015
//********************************************************************************
import java.util.Scanner;

public class Hwk12
{
	public static void main(String[] args)
	{
		//input unsorted list of 20 integers
		int[] list = { 62, 90, 90, 2, 92, 91, 47, 38, 4, 30, 
				9, 82, 27, 78, 36, 29, 45, 42, 90, 98 };
		
		//get user specified search value
		int value = getValue();

		//display the number of times the search value is found in the array
		int totalTimes = getTotalTimes(list, value);
		
		//display element position of the first occurence of the search value
		//if search value exists within the list
		int position;
		if (totalTimes > 0)
		{
			position = sequentialSearch(list, value);
		}	
	}

	//get user specified search value
	public static int getValue()
	{
		Scanner stdin = new Scanner(System.in);

		System.out.print("Input value to search for: ");
		int getValue = stdin.nextInt();
		return getValue;
	}

	//display the number of times the search value is found in the array
	public static int getTotalTimes(int[] list, int value)
	{
		//store default value
		boolean found = false;

		//initialize accumulator
		int total = 0;

		for (int i = 0; i < list.length; i++)
		{
			if (value == list[i])
			{
				found = true;
				total++;
			}
			
		}
		System.out.println(value + " appears on the list " + total + 
					" time(s).");
		return total;
	}

	//display element position of the first occurence of the search value
	//if search value exists within the list
	public static int sequentialSearch(int[] list, int value)
	{
		//element the search value is found at 
		int element;

		//start search at element 0
		int index = 0;

		//store default values indicating the search value was not found
		element = -1;
		boolean found = false;

		//search the array
		while (!found && index < list.length)
		{
			if (list[index] == value)
			{
				found = true;
				element = index;
			}
			index++	;		
		}

		System.out.println("The first occurrence is at position " 
					+ (element + 1) + ".");
		return element;
	}
}


Input value to search for: 90
90 appears on the list 3 time(s).
The first occurrence is at position 2.



Input value to search for: 78
78 appears on the list 1 time(s).
The first occurrence is at position 14.



Input value to search for: 100
100 appears on the list 0 time(s).