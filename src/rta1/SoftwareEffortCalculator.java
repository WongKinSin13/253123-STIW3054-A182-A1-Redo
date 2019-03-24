package rta1;
import java.util.Scanner;

public class SoftwareEffortCalculator {

    static Scanner scan = new Scanner(System.in);

    public static void main(String args[]) {
    	CalculateUUCP uucp1 = new CalculateUUCP();
    	CalculateTechFactors tFactor1 = new CalculateTechFactors();
    	CalculateSoftwareSize szUc1 = new CalculateSoftwareSize();
    	CalculateExpFactors eFactor1 = new CalculateExpFactors();
    	CalculateUCP ucp1 = new CalculateUCP();
    	CalculateManHours mhrPhase1 = new CalculateManHours ();
    	CalculateAdjustedManHr mhrPhase2 = new CalculateAdjustedManHr();
    	CalculateReportingManHr mhrPhase3 = new CalculateReportingManHr ();
    	CalculateTotalManHrFinal mhrPhase4 = new CalculateTotalManHrFinal();
    	
        System.out.println("Software Effort Calculator Version 1.0");
        System.out.println("======================================");
        System.out.println("-------------Main Menu----------------");
        System.out.println("Enter '1' to start calculation.");
        System.out.println("Enter '0' to exit program.");
        System.out.print("Your choice: ");

        try {
            int option1 = scan.nextInt();
            switch (option1) {
                case 1:
                	uucp1.calculateActorPts();
                	uucp1.calculateUseCases();
                	uucp1.calculateUUCP();
                	tFactor1.calculateTechFactors();
                	tFactor1.calculateTCF();
                	szUc1.calculateSoftwareSize(uucp1.getUUCP(),tFactor1.getTCF());
                    eFactor1.calculateExpFactors();
                    eFactor1.calculateEF();
                	ucp1.calculateUCP(szUc1.getSZUC(), eFactor1.getEfactor());
                	mhrPhase1.calculateManHours(ucp1.getUCP());
                	mhrPhase2.calculateAdjustedManHr(mhrPhase1.getTotalManHr());
                	mhrPhase3.calculateReportingManHr();
                	mhrPhase4.calculateTotalManHrFinal(mhrPhase2.getAdjustedMHR(), mhrPhase3.getReportedMHR());
                    break;
                case 0:
                    System.out.println("\nShutting down "
                            + "program. Have a good day.");
                    break;
                default:
                    System.out.println("\nUnknown command, closing program. "
                            + "Have a good day.");
                    break;
            }
        } catch (Exception e) {
            System.out.print("Unknown command, closing program.\n");
        }
    }
}
