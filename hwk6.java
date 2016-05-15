//***************************************************************************************
//Hwk6.java 		This program will input a series of exam scores, print the total 
//			scores entered, and print the largest and smallest score
//Inputs: 		exam score values
//Outputs: 		total scores entered, largest score, smallest score
//Written by: 		Charlie O'Hara
//Last updated: 	October 5, 2015
//**************************************************************************************

import java.util.Scanner;

public class Hwk6
{
	public static void main(String[] args)
	{			
		int scoreValue;			//exam score value
		int totalScores = 0;		//total number of exam scores entered

		Scanner keyboard = new Scanner(System.in);

		//Display instructions
		System.out.println("This program allows the user to " +
				"enter a series of exam scores.");
		System.out.println("The output will include total number of exam scores");
		System.out.println("and the highest and lowest exam score.");
		System.out.println("Please enter -1 when finished.");

		//Get the first score
		System.out.print("Enter an exam score or -1 to terminate: ");
		scoreValue = keyboard.nextInt();

		//Initialize variables to determine highest and lowest exam score
		int low = scoreValue, high = scoreValue;

		//Enter scores until -1 is used to terminate input
		while (scoreValue != -1) 
		{
			if (scoreValue < low) 
				low = scoreValue;

    			if (scoreValue > high) 
				high = scoreValue;        

			totalScores++;
    
			System.out.print("Enter an exam score or -1 to terminate: ");
    			scoreValue = keyboard.nextInt();
		}
		//Display total number of scores
		System.out.println("The total number of exam scores entered is " +
					totalScores + ".");

		//Display highest and lowest score
		System.out.println("The highest score is " + high + ".");
		System.out.println("The lowest score is " + low + ".");
	}
}