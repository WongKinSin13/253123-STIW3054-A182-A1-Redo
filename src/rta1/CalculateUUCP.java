package rta1;
import java.util.Scanner;
public class CalculateUUCP {
	
	Scanner scan = new Scanner(System.in);
	public int actorPts;
	public int useCases;
	public int uUCP;
	
	public void calculateActorPts() {
		System.out.println("\n1.Calculate Total Actor Points");
		System.out.println("==============================");
		System.out.println("*Actor Type Explaination*");
		System.out.println("Simple : Defined API");
		System.out.printf("%s\n%34s\n", "Average: Interactive or", "Protocol driven interface");
		System.out.println("Complex: GUI\n");
		System.out.println("Please enter the quantity of each actor type:");
		System.out.print("Simple : ");
		int simp = scan.nextInt();
		System.out.print("Average: ");
		int avg = scan.nextInt();
		System.out.print("Complex: ");
		int comp = scan.nextInt();
		this.actorPts = (simp * 1 + avg * 2 + comp * 3);
		System.out.println("Total Actor Point = " + actorPts);
	}
	
	public void calculateUseCases() {
		System.out.println("\n2.Calculate Total Use cases");
		System.out.println("===========================");
		System.out.println("Use case type explaination:");
		System.out.println("Simple : 3 or more transactions.");
		System.out.printf("%s\n", "Average: 4 to 7 transactions.");
		System.out.println("Complex: More than 7 transactions.");
		System.out.println("Complex: GUI\n");
		System.out.println("Please enter the quantity of each use case type:");
		System.out.print("Simple : ");
		int simp = scan.nextInt();
		System.out.print("Average: ");
		int avg = scan.nextInt();
		System.out.print("Complex: ");
		int comp = scan.nextInt();
		this.useCases = (simp * 5 + avg * 10 + comp * 15);
		System.out.println("Total Use Cases = " + useCases);
	}
	
	public void calculateUUCP() {
		System.out.println("\nUnadjusted Use Case Points(UUCP) = Total Actor Points + Total Use Cases");
		int uucP = this.actorPts + this.useCases;
		this.uUCP = uucP;
		System.out.printf("Unadjusted Use Case Points(UUCP) = %d\n", uucP);
	}
	
	public int getUUCP() {
		return uUCP;
	}
}
