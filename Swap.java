public class Swap {
	public static void main(String[] args) {
		int a = 5;
		int b = 2;
		System.out.println("Before Swap,");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		a = b;
		b = a;
		System.out.println("After Swap,");
		System.out.println("a =" + a);
		System.out.println("b =" + b);
	}
}