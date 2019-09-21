import java.util.Scanner;
public class Decryption {
	public static void main(String[] args ) {
		Scanner scnr = new Scanner(System.in);
		int n1;
		int n2;
		int n3;
		int n4;
		int x; //This is the original number
		int y; //This is the decrypted number
		int temp;
		
		System.out.println("Please enter a 4 digit number: ");
		x = scnr.nextInt();
		
		
		n1 = (x / 1000);
		n2 = ((x % 1000) / 100);
		n3 = ((x % 100) / 10);
		n4 = (x % 10);
		
		temp = (((n1 + 3) % 10));
		n1 = (((n3 + 3) % 10));
		n3 = temp;
		
		temp = (((n2 + 3) % 10));
		n2 = (((n4 + 3) % 10));
		n4 = temp;
		
		y = (n1 * 1000 + n2 * 100 + n3 * 10 + n4);
		
		System.out.print("The originial encrypted number would be: ");
		System.out.println(y);
		
		scnr.close();
		
	}

}
