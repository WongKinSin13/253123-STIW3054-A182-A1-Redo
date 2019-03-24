package rta1;

public class CalculateSoftwareSize {
	public double sZUC;
	public void calculateSoftwareSize(int uUCP, double tCF) {
		System.out.println("Size of the software(use case)= UUCP * TCF ");
		double szUC = uUCP * tCF;
		this.sZUC = szUC;
		System.out.printf("Size of the software(use case)= %.1f\n", szUC);
	}
	public double getSZUC() {
		return sZUC;
	}
}
