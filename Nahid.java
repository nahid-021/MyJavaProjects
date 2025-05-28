import java.lang.*;
import java.util.Scanner;

public class Nahid {
	public static void main(String[] args) {
		//System.out.println("Hello World");
		
		/*Scanner s1 = new Scanner(System.in);
		System.out.print("Enter an integer number: ");
		int value1 = s1.nextInt();
		System.out.println("Your entered value is: " + value1);
		
		Scanner s2 = new Scanner(System.in);
		System.out.print("Enter an integer number: ");
		double value2 = s2.nextDouble();
		System.out.println("Your entered value is: " + value2);
		
		Scanner s3 = new Scanner(System.in);
		System.out.print("Enter an string value: ");
		String value3 = s1.nextLine();
		System.out.println("Your entered value is: " + value3);
		
		
		
		s1.clode();
		s2.close();
		s3.close(); */
		
		
		
		
		Scanner s = new Scanner(System.in);
		System.out.print("number1: ");
		int value1 = s.nextInt();
		System.out.println("Your entered value1 is: " + value1);
		System.out.print("number2: ");
		int value2 = s.nextInt();
		System.out.println("Your entered value2 is: " + value2);
		
		
		System.out.println("sum: " + (value1+value2));
		System.out.println("minus: " + (value1-value2));
		System.out.println("mul: " + (value1*value2));
		if(value2 != 0) {
			System.out.println("div: " + ((double)value1/value2));
		    System.out.println("Percentage: " + ((double)value1%value2));
		}
		else {
			System.out.println("Not divisible by 0.");
		}
		
		s.close();
	}
}