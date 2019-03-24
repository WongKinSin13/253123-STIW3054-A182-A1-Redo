package rta1;

public class CalculateTotalManHrFinal {
	
	public double totalManHourFinal;
	public void calculateTotalManHrFinal(double adjustedManHour, int reportedManHour) {
		System.out.println("\n8.Calculating Total Man-Hours");
		System.out.println("=============================");
		System.out.println("Total Man-Hours = Adjusted man-hours + Reporting man-hours");
		double manHourFinal = adjustedManHour + reportedManHour;
		this.totalManHourFinal = manHourFinal;
		System.out.printf("Total Man-Hours = %.2f %s", manHourFinal, "man-hours\n");
	}
}
