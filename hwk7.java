//******************************************************************************** 
//Hwk7.java	This program calculates butterfly population estimates
//Inputs: 	estimated number of male and female butterflies
//Outputs: 	total butterflies, sex ratio, variance, gender difference,
//	     	mating pairs, growth factor, ratio factor, potential population 
//Written by:	Charlie O'Hara
//Last modified:October 10, 2015
//*******************************************************************************

import java.util.Scanner;
import java.text.DecimalFormat;

public class Hwk7 
{
	public static void main (String[] args) 
	{
		Scanner stdin = new Scanner(System.in);

		//Variables established in Hwk3
    		int males, females;
    		int totalButterflies, sexRatio, ratioVariance;
		int genderDifference, matingPairs;

		//Request user input for calculations
		System.out.println("\nButterfly Estimator\n");
		System.out.print("Enter the estimated males population: ");
		males = stdin.nextInt();
		System.out.print("Enter the estimated females population: ");
		females = stdin.nextInt();

		//Calculations from Hwk3
		totalButterflies = males + females; 
		sexRatio = males / females;
		ratioVariance = males % females;
		genderDifference = males - females;
		matingPairs = males * females;

		//Output from Hwk3
		System.out.println("\nTotal Butterflies: " + totalButterflies );
		System.out.println("Sex Ratio: " + sexRatio );
		System.out.println("Variance: " + ratioVariance );
		System.out.println("Gender Difference: " + genderDifference );
		System.out.println("Mating Pairs: " + matingPairs );

		//New variables for Hwk7
		double growthFactor, ratioFactor;
		int potentialPopulation;

		//Calculate growth factor
		growthFactor = Math.sqrt(matingPairs);

		//Format growth factor output to three decimal places
		DecimalFormat twoDigits = new DecimalFormat("#.000");

		//Display growth factor output
		System.out.println("Growth Factor: " + twoDigits.format(growthFactor));	

		//Calculate ratio factor
		//If sex ratio = 0, ratio factor equals square root of the ratio variance
		//Otherwise, calculate ratio factor by dividing growth factor by sex ratio	
		if (sexRatio == 0)
			ratioFactor = Math.sqrt(ratioVariance);		
		else
			ratioFactor = growthFactor / sexRatio;

		//Format ratio factor output to one decimal place
		DecimalFormat oneDigit = new DecimalFormat("#.0");

		//Display ratio factor output
		System.out.println("Ratio Factor: " + oneDigit.format(ratioFactor));	

		//Calculate potential population with integer output
		potentialPopulation = (int)Math.pow(2.0, (int)ratioFactor);

		//Display potential population output
		System.out.println("Potential Population: " + potentialPopulation); 	
	}
}


Butterfly Estimator

Enter the estimated males population: 50
Enter the estimated females population: 15

Total Butterflies: 65
Sex Ratio: 3
Variance: 5
Gender Difference: 35
Mating Pairs: 750
Growth Factor: 27.386
Ratio Factor: 9.1
Potential Population: 512


Butterfly Estimator

Enter the estimated males population: 1
Enter the estimated females population: 10

Total Butterflies: 11
Sex Ratio: 0
Variance: 1
Gender Difference: -9
Mating Pairs: 10
Growth Factor: 3.162
Ratio Factor: 1.0
Potential Population: 2


Butterfly Estimator

Enter the estimated males population: 10
Enter the estimated females population: 1

Total Butterflies: 11
Sex Ratio: 10
Variance: 0
Gender Difference: 9
Mating Pairs: 10
Growth Factor: 3.162
Ratio Factor: .3
Potential Population: 1