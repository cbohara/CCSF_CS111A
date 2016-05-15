//***************************************************************************************
//Hwk5.java 		This program will find the winner of a sales contest by 
// 			determining which salesrep sold the most units.
//Inputs: 		total number of salesreps, number of units sold by each salesrep
//Outputs: 		the number of units the winner sold
//Written by: 		Charlie O'Hara
//Last updated: 	September 27, 2015
//**************************************************************************************

import java.util.Scanner;

public class Hwk5
{
	public static void main (String[] args)
	{
		Scanner stdin = new Scanner(System.in);

		//input the total number of salesreps
		System.out.print("Enter the total number of salesreps: ");
		int numReps = stdin.nextInt(); 			//total number salesreps
		int max = 0; 					//used to determine max

		//input the number of units sold by the salesreps
		if (numReps > 0)
		{
			for (int i = 1; i <= numReps; i++)
			{
				System.out.print("Enter the units for salesrep #" + i + ": ");
				int units = stdin.nextInt(); 	//units sold per salesrep
				if (units > max)
					max = units;
			}
			System.out.println("The winner sold " + max + " units!");
		}
		//inform user total number of salesreps must be greater than zero
		else
			System.out.println("Total salesreps must be greater than zero. "
						+ "Please try again.");
	}
}



Enter the total number of salesreps: 4
Enter the units for salesrep #1: 900
Enter the units for salesrep #2: 850
Enter the units for salesrep #3: 950
Enter the units for salesrep #4: 800
The winner sold 950 units!

Enter the total number of salesreps: 1
Enter the units for salesrep #1: 900
The winner sold 900 units!

Enter the total number of salesreps: 0
Total salesreps must be greater than zero. Please try again.