import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number to check: ");
		int n = s.nextInt();
		System.out.println("The number: " + n);
		if(n%2==0) {
			System.out.println("The number is Even.");
		}
		else {
			System.out.println("The number is Odd.");
		}
		s.close();
	}
}