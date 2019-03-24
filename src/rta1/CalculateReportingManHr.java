package rta1;
import java.util.Scanner;
public class CalculateReportingManHr {
	Scanner scan = new Scanner(System.in);
	public int reportedManHour;
	
	public void calculateReportingManHr() {
		System.out.println("\n\n7.Calculating Reporting Man-Hours");
		System.out.println("=================================");
		System.out.println("Please enter the quantity and average ");
		System.out.println("man-hours of each report type:");

		System.out.print("Simple : \n");
		System.out.println("-------- ");
		System.out.print("Quantity          : ");
		int simpQty = scan.nextInt();
		System.out.print("Average Man-hours : ");
		int simpMH = scan.nextInt();

		System.out.println("\nAverage:");
		System.out.println("-------- ");
		System.out.print("Quantity          : ");
		int avgQty = scan.nextInt();
		System.out.print("Average Man-hours : ");
		int avgMH = scan.nextInt();

		System.out.println("\nComplex: ");
		System.out.println("-------- ");
		System.out.print("Quantity          : ");
		int compQty = scan.nextInt();
		System.out.print("Average Man-hours : ");
		int compMH = scan.nextInt();
		int subTotalHr = ((simpQty * simpMH) + (avgQty * avgMH) + (compQty * compMH));
		this.reportedManHour = subTotalHr;
		System.out.printf("\nTotal Reporting Man-hour estimate = %d %s", subTotalHr, " man-hours\n");
	}
	
	public int getReportedMHR() {
		return reportedManHour;
	}
}
