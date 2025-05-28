
class Student1 {
	String name;
	int rollNumber;
	float marks;
	Student1(String n, int r, float m) {
		name = n;
		rollNumber = r;
		marks = m;
	}
	void displayInfo() {
		System.out.println("Name: " + name + ", Roll: " + rollNumber + ", Marks: " + marks );
	}
}
public class Student {
	public static void main(String[] args) {
		Student1 student = new Student1("Alice",1234,90.8);
		student.displayInfo();
	}
}
