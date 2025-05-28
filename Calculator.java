/*  Create a Calculator class and overload the multiply() method:

multiply(int a, int b)

multiply(double a, double b)

multiply(int a, int b, int c) */

public class Calculator {
	public int multiply(int a, int b) {
	return a*b; }
	public double multiply(double a, double b) {
	return a*b; }
	public int multiply(int a, int b, int c) {
	return a*b*c; }
	
	public static void main(String args[]) {
		Calculator math = new Calculator();
		System.out.println(math.multiply(2,3));
		System.out.println(math.multiply(2.3,3.2));
		System.out.println(math.multiply(2,3,4));
	}
}