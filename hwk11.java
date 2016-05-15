//********************************************************************************
//Hwk11.java	This program will read weekly rainfall for a given city, calculate
//		rainfall average, compare weekly difference from rainfall average,
//		and determine smallest and largest rainfall values 
//Inputs: 	52 weekly rainfall values	
//Outputs: 	display each value, annual average, weekly difference from average,
//		smallest rainfall value, largest rainfall value
//Written by:	Charlie O'Hara
//Modified:	November 19, 2015
//********************************************************************************
import java.text.DecimalFormat;

public class Hwk11
{
	public static void main(String[] args)
	{	
		//create array with 52 or fewer values
		int numWeeks = 52;
		double[] rainFall = new double[numWeeks];

		//input values and return total number of values
		int total = getRainData(rainFall);

		//calculate average rainfall
		double average = calcAverage(rainFall, numWeeks);

		//format display
		DecimalFormat twoDigits = new DecimalFormat("#0.00");

		//display weekly rainfall values and difference from average
		for (int i = 0; i < numWeeks; i++)
		{
			System.out.print(twoDigits.format(rainFall[i]));
			System.out.print("		");
			System.out.println(twoDigits.format(rainFall[i] - average));
		}

		//determine and display smallest rainfall value
		//initialize minimum value to first array element
		double min = rainFall[0];

		//loop through other array values to find smallest value
		for (int i = 1; i < numWeeks; i++)
		{
			if (rainFall[i] < min)
				min = rainFall[i];
		}
		
		//display smallest rainfall value
		System.out.println(twoDigits.format(min) +
					" is the smallest rainfall value.");


		//determine and display largest rainfall value
		//initialize maximum value to first array element
		double max = rainFall[0];

		//loop through other array values to find largest value
		for (int i = 1; i < numWeeks; i++)
		{
			if (rainFall[i] > max)
				max = rainFall[i];
		}
		
		//display largest rainfall value
		System.out.println(twoDigits.format(max) + 
					" is the largest rainfall value.");
	}

	//input values and return total number of values
	public static int getRainData(double[] rainFall)
	{			
		int numWeeks = 52;

		//input random weekly rainfall values into array
		for (int i = 0; i < numWeeks; i++)
		{
			rainFall[i] = Math.random() * 50.0;
		}

		int result = rainFall.length;
		return result;
	}
	
	//calculate average rainfall
	public static double calcAverage(double[] rainFall, int numWeeks)
	{
		//sum up values in array
		double sum = 0.0;
		for (int i = 0; i < numWeeks; i++)
		{
			sum += rainFall[i];
		}
		
		//calculate average
		double average = sum / numWeeks;
		double result = average;
		return result;
	}
}
	

42.82		15.79
32.19		5.16
30.74		3.72
40.35		13.32
13.23		-13.80
46.82		19.79
41.51		14.48
49.54		22.51
27.22		0.19
32.09		5.07
8.75		-18.28
3.32		-23.71
15.93		-11.09
44.69		17.66
47.50		20.48
48.83		21.80
48.40		21.37
49.58		22.56
30.10		3.07
37.36		10.33
26.93		-0.10
22.35		-4.68
3.20		-23.83
24.11		-2.91
25.94		-1.08
36.12		9.10
44.19		17.16
42.35		15.33
19.77		-7.25
14.97		-12.05
4.86		-22.17
34.63		7.61
4.97		-22.05
20.54		-6.49
41.51		14.48
6.49		-20.54
27.38		0.35
31.57		4.54
1.88		-25.15
33.52		6.49
24.55		-2.48
26.67		-0.35
30.91		3.89
0.91		-26.11
39.65		12.63
38.99		11.96
19.47		-7.56
35.78		8.76
3.84		-23.19
17.78		-9.25
2.12		-24.91
6.43		-20.59
0.91 is the smallest rainfall value.
49.58 is the largest rainfall value.