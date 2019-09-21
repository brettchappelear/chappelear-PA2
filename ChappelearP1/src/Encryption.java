import java.util.Scanner;

public class Encryption {
	public static void main(String[] args ) {
		Scanner scnr = new Scanner(System.in);
		int n1;
		int n2;
		int n3;
		int n4;
		int x;  //This is the original number
		int y;  //This is the new encrypted number
		int temp = 0;
		
		System.out.println("Please enter a 4 digit number: ");
		x = scnr.nextInt();
		
		n1 = (x / 1000);
		n2 = ((x % 1000) / 100);
		n3 = ((x % 100) / 10);
		n4 = (x % 10);
		
		n1 = ((n1 + 7) % 10);
		n2 = ((n2 + 7) % 10);
		n3 = ((n3 + 7) % 10);
		n4 = ((n4 + 7) % 10);
		
		temp = n1;
		n1 = n3 * 1000;
		n3 = temp * 10;
		
		temp = n2;
		n2 = n4 * 100;
		n4 = temp;
		
		y = n1 + n2 + n3 + n4;

		System.out.print("The encrypted number would be: ");
		System.out.println(y);
		
		scnr.close();
		
		
	}
}
