package rta1;
import java.util.Scanner;
public class CalculateExpFactors{
	
	Scanner scan = new Scanner(System.in);
	public double eFactor;
	public double eCF;
	public void calculateExpFactors() {
		double weightFactor;
		int projectRating;
		double subTotalFinal = 0;
		System.out.println("\n4.Weighting Experience Factors");
		System.out.println("==============================");
		String[] listEFactor = new String[8];
		listEFactor[0] = "E1. Familiar with FPT software process";
		listEFactor[1] = "E2. Application experience";
		listEFactor[2] = "E3. Paradigm experience(OO)";
		listEFactor[3] = "E4. Lead analyst capability";
		listEFactor[4] = "E5. Motivation";
		listEFactor[5] = "E6. Stable requirements";
		listEFactor[6] = "E7. Part-time workers";
		listEFactor[7] = "E8. Difficulty of programming language";

		double[] subTotal = new double[8];
		for (int x = 0; x < 8; x++) {
			System.out.println(listEFactor[x]);
			System.out.print("Set Weight Factor: ");
			weightFactor = scan.nextDouble();
			System.out.print("Set Project Rating: ");
			projectRating = scan.nextInt();
			System.out.println("");
			subTotal[x] = weightFactor * projectRating;
			subTotalFinal = subTotalFinal + subTotal[x];
			this.eFactor = subTotalFinal;
		}
		System.out.println("Total EFactor = " + subTotalFinal);
		System.out.println("");
	}
	public void calculateEF() {
		System.out.println("Experience Factor(EF) = (-0.03 * Efactor) + 1.4");
		double ecf = (-0.03 * this.eFactor) + 1.4;
		this.eCF = ecf;
		System.out.printf("Experience Factor(EF) = %.2f\n\n", ecf);
	}
	public double getEfactor() {
		return eCF;
	}
}
