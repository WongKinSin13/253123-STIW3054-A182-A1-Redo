package rta1;
import java.util.Scanner;
public class CalculateUseCases {
	Scanner scan = new Scanner(System.in);
	
	public int useCases;
	
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
}
