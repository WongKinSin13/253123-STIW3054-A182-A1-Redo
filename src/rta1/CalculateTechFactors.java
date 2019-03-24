package rta1;
import java.util.Scanner;
public class CalculateTechFactors {
	Scanner scan = new Scanner(System.in);
	
	public double tFactor;
	public double tCF;
	
	public void calculateTechFactors() {
		double weightFactor;
		int projectRating;
		double subTotalFinal = 0;
		System.out.println("\n3.Weighting Technical Factors");
		System.out.println("=============================");
		String[] listTFactor = new String[13];

		listTFactor[0] = "T1. Must have a distributed solution";
		listTFactor[1] = "T2. Must respond to specific performance objectives";
		listTFactor[2] = "T3. Must meet end-user efficiency desires";
		listTFactor[3] = "T4. Complex internal processing";
		listTFactor[4] = "T5. Code must be reusable";
		listTFactor[5] = "T6. Must be easy to install";
		listTFactor[6] = "T7. Must be easy to use";
		listTFactor[7] = "T8. Must be portable";
		listTFactor[8] = "T9. Must be easy to change";
		listTFactor[9] = "T10. Must allow concurrent users";
		listTFactor[10] = "T11. Includes special security features";
		listTFactor[11] = "T12. Must provide direct access for 3rd parties";
		listTFactor[12] = "T13. Requires special user training facilities";

		double[] subTotal = new double[13];
		for (int x = 0; x < 13; x++) {
			System.out.println(listTFactor[x]);
			System.out.print("Set Weight Factor: ");
			weightFactor = scan.nextDouble();
			System.out.print("Set Project Rating: ");
			projectRating = scan.nextInt();
			System.out.println("");
			subTotal[x] = weightFactor * projectRating;
			subTotalFinal = subTotalFinal + subTotal[x];
			this.tFactor = subTotalFinal;
		}
		System.out.println("Total TFactor = " + subTotalFinal);
		System.out.println("");
	}
	
	public void calculateTCF() {
		System.out.println("Technical Complexity Factor(TCF) = (0.01 * Tfactor) + 0.6");
		double tcf = (0.01 * this.tFactor) + 0.6;
		this.tCF = tcf;
		System.out.printf("Technical Complexity Factor(TCF) = %.2f\n\n", tcf);
	}
	
	public double getTCF() {
		return tCF;
	}
}
