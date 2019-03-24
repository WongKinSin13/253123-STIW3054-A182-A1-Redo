package rta1;

public class CalculateUCP {
	public double uCP;
	public void calculateUCP(double sZUC, double eF) {
		System.out.println("Use Case Points(UCP) = SzUC * EF ");
		double ucP = sZUC * eF;
		this.uCP = ucP;
		System.out.printf("Use Case Points(UCP) = %.3f\n", ucP);
	}
	public double getUCP() {
		return uCP;
	}
}
