import java.util.Scanner;

public class LabTwoRoomDimensions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scnr = new Scanner(System.in);
		
		
		double length;
		double width;
		double height;
		double volume;
		double area;
		double perimeter;
		char userContinue;
		
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		
		userContinue = 'y';
		
		while ((userContinue == 'y') || (userContinue == 'Y')) {
			System.out.println("Enter length: ");
				length = scnr.nextDouble();
			System.out.println("Enter width: ");
				width = scnr.nextDouble();
			System.out.println("Enter height: ");
				height = scnr.nextDouble();
			
			area = length * width;
			perimeter = (2 * length) + (2 * width);
			volume = length * width * height;
			
			System.out.println("Area: " + area);
			System.out.println("Perimeter: " + perimeter);
			System.out.println("Volume: " + volume);
			
			System.out.println("Continue? (y/n): ");
			userContinue = scnr.next().charAt(0);
		}
		
		System.out.println("Lab two complete!");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
