/*
Aaron Crosley
Java - 1st Hour
FINAL EXAM
*/
import java.util.Scanner;

public class CampingFees
{
	public static void main (String[] args)
	{
		int days = 0;
		int totCampers = 0;
		int totFees = 0;
		int feeAvg = 0;
		int cost = 0;
		String redCode, name;
		String response = "Y";
		int base = 0;
		int top = 0;

		Scanner keyb = new Scanner(System.in);
		System.out.println("Begin program: Camping fees");
		System.out.println(" ");

		while (response.equalsIgnoreCase("Y"))
			{
				System.out.println("Enter the name of the camper: ");
				System.out.println(" ");
				name = keyb.nextLine();

				System.out.println("Enter the residency code ofthe camper: ");
				System.out.println(" ");
				redCode = keyb.nextLine();

				System.out.println("Enter the number of days the camper was at the park: ");
				System.out.println(" ");
				days = keyb.nextInt();

				if(days > 14)
					{
						days = 14;
					}

				if(redCode.equalsIgnoreCase("R") && days > 7)
					{
						base = 7;
						top = days - 7;
					}

				if(redCode.equalsIgnoreCase("N"))
					{
						cost = 15 * days;
					}

				 if(redCode.equalsIgnoreCase("R"))
					{
						cost = (base * 10) + (top * 8);
					}

				totCampers = totCampers++;
				totFees = totFees + cost;

				System.out.println("Enter Y to process another campers");
				System.out.println("Enter N to stop processing campers");
				System.out.println(" ");
				response = keyb.nextLine();
			}

			feeAvg = totFees / totCampers;

			System.out.println("Total number of campers: " + totCampers);
			System.out.println("Total fees charged: " + totFees);
			System.out.println("Average fee per camper: " + feeAvg);
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("End Program");
		}
	}











