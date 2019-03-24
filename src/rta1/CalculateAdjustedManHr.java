package rta1;
import java.util.Scanner;
public class CalculateAdjustedManHr{
	Scanner scan = new Scanner(System.in);
	public double adjustedManHour;
	public void calculateAdjustedManHr(double totalManHour) {
		System.out.println("\n\n6.Calculating Adjusted Man-Hours");
		System.out.println("================================");
		System.out.println("Adjusted Man-Hours = (1.0 + .xx[%]) * total man-hours");
		System.out.println("xx represent risk coefficients. ");
		System.out.print("Please enter the coefficient to be used : ");
		double coefficient = scan.nextDouble();
		double adjustedManHr = (1.0 + coefficient) * totalManHour;
		this.adjustedManHour = adjustedManHr;
		System.out.printf("\nAdjusted Man-Hours = %.2f %s", adjustedManHr, " man-hours");
	}
	public double getAdjustedMHR() {
		return adjustedManHour;
	}
}
