//******************************************************************************** 
//Hwk8.java	This program calculates and displays the parking charges for each
//		customer who parked in the parking garage yesterday, as well as
//		the amount of money the garage made yesterday.
//Inputs: 	total number of customers, hours parked per customer
//Outputs: 	charges per customer, amount garage earned 
//Written by:	Charlie O'Hara
//Last modified:October 26, 2015
//*******************************************************************************

import java.util.Scanner;
import java.text.DecimalFormat;

public class Hwk8
{
	public static void main(String[] args)
	{
		//get the total number of customers
		double customers = getCustomers();
		
		//initialize accumulator
		double totalCharges = 0.0;
		
		for (int i = 1; i <= customers; i++)
		{
			//get hours parked per customer
			double hours = getHours();

			//calculate charge per customer
			double charges = calculateCharges(hours);

			//display hours parked and total charge per customer
			displayChargePerCustomer(hours, charges);

			//calculate total sales for the parking garage
			totalCharges += charges;
		}

		//display amount the parking garage earned
		displayTotalCharges(totalCharges);

		System.exit(0);
	}

	//get total number of customers
	public static double getCustomers()
	{
		Scanner stdin = new Scanner(System.in);

		System.out.print("Input the total number of customers: ");
		double getCustomers = stdin.nextDouble();
		return getCustomers;			
	}

	//get hours parked per customer
	public static double getHours()
	{
		Scanner stdin = new Scanner(System.in);

		System.out.println("Input the number of hours parked: ");
		double getHours = stdin.nextDouble();
		return getHours;
	}

	//calculate amount charged per customer
	public static double calculateCharges(double hours)
	{
		double fees;

		if (hours < 3)
		{
			fees = 2.00;	
		}

		else if (hours < 24)
		{
			fees = 2.00 + ((hours - 3) * 0.50);
		}

		else
			fees = 10.00;

		double calculateCharges = fees;
		return calculateCharges;
	}

	//display hours parked and charge per customer
	public static void displayChargePerCustomer(double hours, double charges)
	{
		DecimalFormat twoDigits = new DecimalFormat("#0.00");

		System.out.println("The customer parked for " + hours +
					" hour(s) and was charged $" 
					+ twoDigits.format(charges) + ".\n");
	}

	//display amount garage earned
	public static void displayTotalCharges(double totalCharges)
	{
		DecimalFormat twoDigits = new DecimalFormat("#0.00");

		System.out.println("The garage made $" + 
					twoDigits.format(totalCharges) +
					" yesterday.");
	}

}


Input the total number of customers: 7
Input the number of hours parked: 
1
The customer parked for 1.0 hour(s) and was charged $2.00.

Input the number of hours parked: 
2
The customer parked for 2.0 hour(s) and was charged $2.00.

Input the number of hours parked: 
3
The customer parked for 3.0 hour(s) and was charged $2.00.

Input the number of hours parked: 
4
The customer parked for 4.0 hour(s) and was charged $2.50.

Input the number of hours parked: 
18
The customer parked for 18.0 hour(s) and was charged $9.50.

Input the number of hours parked: 
19
The customer parked for 19.0 hour(s) and was charged $10.00.

Input the number of hours parked: 
24
The customer parked for 24.0 hour(s) and was charged $10.00.

The garage made $38.00 yesterday.