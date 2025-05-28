import java.util.Scanner;
class aritra {
	public String name;
	private int age;
	public int id;
	
	
	aritra(String name, int id, int age) {
		this.name = name;
		this.age = age;
		this.id = id;
	}
	void get() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Name: ");
		this.name = s.nextLine();
		
		System.out.print("Enter age: ");
		this.age = s.nextInt();
		
		System.out.print("Enter id: ");
		this.id = s.nextInt();
		
		s.close();
	}
	
	void display() {
		System.out.println("Name: " + name + " Age: " + age + " ID: " + id);
	}
}
	

public class Tanvir {
	public static void main(String args[]) {
		aritra ari = new aritra("Aritra", 21 , 1234);
		ari.display(); 
		ari.get();
		ari.display();
	}
}
		