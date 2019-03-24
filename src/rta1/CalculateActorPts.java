package rta1;
import java.util.Scanner;
public class CalculateActorPts{
	
	Scanner scan = new Scanner(System.in);
	public int actorPts;
	
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
	
	public int getActorPts() {
		return actorPts;
	}
}
	
	
	

