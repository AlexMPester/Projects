import java.util.Scanner;

public class DisCon {
	
	private int inch = 1;
	private int foot; 
	private int yard;
	Scanner s = new Scanner(System.in);
	int choice;
	
	public void DisMenu() {
		System.out.print("Please Select a Conversion\n1.Inches to Feet\n2.Feet To Yards\n");
		choice = s.nextInt();
		if (choice == 1) {
			InchToFoot();
		}
		else {
		FootToYard();
		}
		
	}
	
	private void InchToFoot() {
		System.out.println("How many inches would you like to convert to feet?");
		inch = s.nextInt();
		foot = inch/12;
		System.out.println(inch + " inches is " + foot + " feet");
	}

	private void FootToYard() {
		System.out.println("How many Feet would you like to convert to Yards?");
		foot = s.nextInt();
		yard = foot / 3;
		System.out.println(foot + " feet is " + yard + " yard(s).");
	}
}
