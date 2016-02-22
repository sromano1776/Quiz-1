package Football_1;

import java.lang.Object;
import java.util.Scanner;

public class Passer_Calculation {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		// Inputed Variables
		short TD;
		short INT;
		int Yards;
		short Compl;
		short ATT;

		// Calculated Variables
		double a;
		double b;
		double c;
		double d;
		double PR;

		//Asking Questions And Saving Responses
		System.out.println(
				"Total touchdowns scored");
		TD = sc.nextShort();
		
		System.out.println(
				"Total interceptions thrown");
		INT = sc.nextShort();
		
		System.out.println(
				"Total yards by quarterback");
		Yards = sc.nextInt();
		
		System.out.println(
				"How many completions have been made");
		Compl = sc.nextShort();
		
		System.out.println(
				"How many pass attempts have been made");
		ATT = sc.nextShort();
		
		
		//Calculations
		a=((Compl/ATT)-.3)*5;
		b=((Yards/ATT)-3)*.25;
		c=(TD/ATT)*20;
		d=2.375-((INT/ATT)*25);
		PR=((a+b+c+d)/6)*100;
		
		//
		//Print Out The Calculated Values
		System.out.println("The rating of this quarter back is "+PR+".");
	}
}
