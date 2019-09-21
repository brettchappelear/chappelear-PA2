package chappelear_P2;
import java.util.Scanner;
public class bmi_calculator {
	public static void main(String[] args ) {
		Scanner scnr = new Scanner(System.in);
		int metricOrStandard;
		double weightInPounds;
		double heightInInches;
		double bmi;
		double weightInKilograms;
		double heightInMeters;
		
		System.out.println("Please enter your weight in pounds: ");
		weightInPounds = scnr.nextDouble();
		weightInKilograms = (weightInPounds * 0.453592);
		
		System.out.println("Please enter your height in inches: ");
		heightInInches = scnr.nextDouble();
		heightInMeters = (heightInInches * 0.0254);
		
		System.out.print("Indicate whether you want Metric or Standard BMI formula.");
		System.out.println(" 1 = Standard and 2 = Metric");
		metricOrStandard = scnr.nextInt();
		
		if (metricOrStandard == 1) {
			bmi = ((703.0 * weightInPounds) / (Math.pow(heightInInches,2)));
			System.out.println("BMI is: " + bmi);
		}
		
		if (metricOrStandard == 2) {
			bmi = (weightInKilograms / (Math.pow(heightInMeters,2)));
			System.out.println("BMI is: " + bmi);
		}
		System.out.println("Underweight <= 18.5");
		System.out.println("Normal weight = 18.5 - 24.9");
		System.out.println("Overweight = 25 - 29.9");
		System.out.println("Obesity = BMI of 30 or greater");
		
		scnr.close();
		
	}
		
}
