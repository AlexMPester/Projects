import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		
		int menuSelection = 0;
		Scanner s = new Scanner(System.in);
		TempCon temp = new TempCon(); 
		DisCon dis = new DisCon();
		
		//Code Begins here
		do{
			System.out.println("Please Select a Menu Option");
			System.out.print("1. Temperatures\n2. Distance\n3. Dollar to Doge\n4. Quit");
			menuSelection = s.nextInt();
			switch (menuSelection){
				default: 
					System.out.println("Your selection is out of the acceptable bounds");
					break; 
				
				case 1: 
					System.out.println("-------------------------------------------------------------------");
					System.out.println("Temperatures Menu");
					temp.TempMenu();
					break;
				
				case 2: 
					System.out.println("-------------------------------------------------------------------");
					System.out.println("Distance");
					dis.DisMenu();
					break;

				case 3: 
					System.out.println("-------------------------------------------------------------------");
					System.out.println("1 Doge = 1 Doge");
					break;
				
				case 4: 
					System.out.println("-------------------------------------------------------------------");
					System.exit(0);;
					break;
			}
		}
			while (menuSelection != 4);
	}

}
