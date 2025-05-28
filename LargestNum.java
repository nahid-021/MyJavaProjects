import java.util.Scanner;

public class LargestNum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n1 = s.nextInt();
		System.out.println("The Number: " + n1);
		System.out.print("Enter a Number 2: ");
		int n2 = s.nextInt();
		System.out.println("The Number: " + n2);
		System.out.print("Enter a Number 3: ");
		int n3 = s.nextInt();
		System.out.println("The Number: " + n3);
		if(n1>n3) {
			if(n1>n2) {
			System.out.println(n1 + " is largest.");
			}
			else {
				System.out.println(n2 + " is largest.");
			}
		}
		else {
			System.out.println(n3 + " is largest.");
		}
	}
}