import java.util.Scanner;

public class TempCon {
	
	private char tempSel; 
	private int fahr;
	private int cel;
	private int kel;
	Scanner s = new Scanner(System.in);
	
	public void TempMenu() {
		System.out.println("-------------------------------------------------------------------");
		System.out.println("What would you like to convert?");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Type 'f' for Fahrenheit, 'c' for Celsius, and 'k' for Kelvin");
		System.out.println("-------------------------------------------------------------------");
		tempSel = s.next().charAt(tempSel);
		switch(tempSel) {
		
		default: 
			System.out.println("You put in an invalid Temperature");
			break; 
			
		case 'f' | 'F':
			Fahrenheit();
			break;
			
		case 'c' | 'C': 
			Celsius();
			break;
			
		case 'k' | 'K':
			Kelvin();
			break;
		}
			
	}
	
	private void Fahrenheit() {
		int i = 0;
		System.out.println("What is the Fahrenheit Temperature?");
		fahr = s.nextInt();
		System.out.println("What do you want to convert your Celsius Temperature to?");
		System.out.println("1. Kelvin\n2. Celsius");
		i = s.nextInt(); 
		switch (i) {
		default: 
		System.out.println("Enter a Proper Character");
		break;
		
		case 1: //Fahrenheit to Kelvin
			System.out.println("-------------------------------------------------------------------");
			kel = ((fahr - 32) * 5/9) + 273; //This needs to be fixed later, float required for proper measurment
			System.out.println(cel + " Fahrenheit is " + kel + " degrees Kelvin.");
			System.out.println("-------------------------------------------------------------------");
		break; 
		
		case 2: // Fahrenheit to Celsius
			System.out.println("-------------------------------------------------------------------");
			cel = (fahr - 32) * 5/9;
			System.out.println(fahr + " Fahrenheit is " + cel + " degree Celsius.");
			System.out.println("-------------------------------------------------------------------");
		break;
		}	

	}
	
	private void Celsius() {
		int i = 0;
		System.out.println("What is the Celsius Temperature?");
		cel = s.nextInt();
		System.out.println("What do you want to convert your Celsius Temperature to?");
		System.out.println("1. Kelvin\n2. Fahrenheit");
		i = s.nextInt(); 
		switch (i) {
		default: 
		System.out.println("Enter a Proper Number");
		break;
		
		case 1: //Celsius to Kelvin
			System.out.println("-------------------------------------------------------------------");
			cel = (kel + 273);
			System.out.println(cel + " Celsius is " + kel + " degrees Celsius.");
			System.out.println("-------------------------------------------------------------------");
		break; 
		
		case 2: // Celsius to Fahrenheit
			System.out.println("-------------------------------------------------------------------");
			fahr = (cel * 9/5) + 32;
			System.out.println(kel + " Celsius is " + fahr + " degree Fahrenheit.");
			System.out.println("-------------------------------------------------------------------");
			break;
		}
	}
	
	private void Kelvin() {
		int i = 0;
		System.out.println("What is the Kelvin Temperature?");
		kel = s.nextInt();
		System.out.println("What do you want to convert your Kelvin Temperature to?");
		System.out.println("1. Celsius\n2. Fahrenheit");
		i = s.nextInt(); 
		switch (i) {
			default: 
			System.out.println("Enter a Proper Character");
			break;
			
			case 1: //Kelvin to Celsius
				System.out.println("-------------------------------------------------------------------");
				cel = (kel - 273);
				System.out.println(kel + " Kelvin is " + cel + " degrees Celsius.");
				System.out.println("-------------------------------------------------------------------");
			break; 
			
			case 2: // Kelvin to Fahrenheit
				System.out.println("-------------------------------------------------------------------");
				fahr = (kel - 273) * 9/5 + 32;
				System.out.println(kel + " Kelvin is " + fahr + " degree Fahrenheit.");
				System.out.println("-------------------------------------------------------------------");
			break;
		} // This will end the Switch
		
	} //This ends Kelvin Function

} //This Ends the class
