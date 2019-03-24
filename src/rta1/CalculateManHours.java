package rta1;
import java.util.Scanner;
public class CalculateManHours{
	
	Scanner scan = new Scanner(System.in);
	
	public double totalManHour;
	
	public void calculateManHours(double uCP) {
		System.out.println("\n5.Calculating Man-Hours");
		System.out.println("=======================");
		System.out.println("Total Man-Hours = Effort Rate(ER) * UCP ");
		System.out.println("From Experience Factor Section, count the numbers " + "of factor rating");
		System.out.println("below 3 in E1-E6 and factor rating " + "that are above 3 in E7-E8 ");
		System.out.println("\nIf total is 2 or less, ER = 20");
		System.out.println("If total is 3 or 4, ER = 28");
		System.out.println("If total is 5 or more, significant failure risk present within the team.\n");
		System.out.print("Please enter the ER value to be used : ");
		int er = scan.nextInt();
		double totalManHr = er * uCP;
		this.totalManHour = totalManHr;
		System.out.println("Total Man-Hours = Effort Rate * UCP ");
		System.out.printf("Total Man-Hours = %.3f %s", totalManHr, "man-hours");
	}
	
	public double getTotalManHr() {
		return totalManHour;
	}
}
