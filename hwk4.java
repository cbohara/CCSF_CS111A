//***************************************************************************
//Hwk4A.java	This program determines if a meeting room is in violation
//		of fire laws regarding the maximum room capacity.
//Inputs :	number of attendees		
//Outputs:	message whether the meeting is legal, the number in excess
//		or the number of additional people that may be added if any
//Written by:	Charlie O'Hara
//Last updated:	September 18, 2015 
//***************************************************************************

import java.util.Scanner;

public class Hwk4A
{
	public static void main (String[] args)
	{
		int roomCapacity = 100;			//maximum room capacity
		int attendees;				//number of attendees
		int excess;				//excess people in room
		int additional;				//additional people may be added			
		
		Scanner stdin = new Scanner(System.in);
		System.out.println("The maximum room capacity is 100 people.");
		System.out.println("Will the meeting violate the maximum room capacity?");

		//get the number of people attending the meeting
		System.out.print("Enter the number of meeting attendees: ");
		attendees = stdin.nextInt();

		//determine if the meeting violates the maximum room capacity
		if (attendees > roomCapacity)
		{
			excess = attendees - roomCapacity;
			System.out.println("The meeting violates the maximum room capacity.");
			System.out.println("There is an excess of " 
					   + excess + " people in the room.");
		}
		else if (attendees == roomCapacity)
		{
			System.out.println("The room is at maximum capacity.");
		}
		else if (attendees >= 0 && attendees < roomCapacity)
		{
			additional = roomCapacity - attendees;	
			System.out.println("The meeting is compliant with the maximum room capacity.");
			System.out.println("There may be an additional " 
					   + additional + " people in the room.");
				
		}
		else
		{
			System.out.println("You have entered an invalid number. Please try again.");
		}	
	}
}



The maximum room capacity is 100 people.
Will the meeting violate the maximum room capacity?
Enter the number of meeting attendees: 120
The meeting violates the maximum room capacity.
There is an excess of 20 people in the room.


The maximum room capacity is 100 people.
Will the meeting violate the maximum room capacity?
Enter the number of meeting attendees: 100
The room is at maximum capacity.


The maximum room capacity is 100 people.
Will the meeting violate the maximum room capacity?
Enter the number of meeting attendees: 70
The meeting is compliant with the maximum room capacity.
There may be an additional 30 people in the room.