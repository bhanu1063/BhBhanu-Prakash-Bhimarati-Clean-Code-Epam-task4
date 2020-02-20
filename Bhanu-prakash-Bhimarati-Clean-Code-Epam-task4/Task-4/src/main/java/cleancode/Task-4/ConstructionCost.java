package cleancode.ht4;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class ConstructionCost {

	public static void ConstCost() {
		PrintStream ps = new PrintStream(new FileOutputStream(FileDescriptor.out));
		Scanner sc = new Scanner(System.in);
		ps.println("Construction cost estimation:- ");
		ps.println("Available Materials:- ");
		ps.println("1. Standard materials");
		ps.println("2. Above standard materials");
		ps.println("3.High standard materials");
		ps.println("4. High standard materials and fully automated home");
		ps.println("Choose(1-4): ");
		try {
			int choice = sc.nextInt();
			double area, cost;
			switch(choice) {
				case 1:
					ps.println("Enter the area of house: ");
					area = sc.nextDouble();
					cost = (1200 * area);
					ps.println("Cost = " +cost+" Rupees");
					break;
				case 2:
					ps.println("Enter the area: ");
					area = sc.nextDouble();
					cost = (1500 * area);
					ps.println("The total cost to build the house = " +cost+" Rupees");
					break;
				case 3:
					ps.println("Enter the area: ");
					area = sc.nextDouble();
					cost = (1800 * area);
					ps.println("The total cost to build the house = " +cost+ " Rupees");
					break;
				case 4:
					ps.println("Enter the area: ");
					area = sc.nextDouble();
					cost = (2500 * area);
					ps.println("The total cost to build the house = " +cost+ " Rupees");
					break;
				default:
					ps.println("Please enter a valid input!!! ");
				}
		} catch (Exception e) {
			ps.println("Please enter a valid input!");
			
		}
		
		
	}

}
