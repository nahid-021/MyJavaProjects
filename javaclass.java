/*  Create a Student class with a default constructor that assigns "Unknown" to name and 0 to age. 
Then, create a student object and display the details. */
class Student {
    String name;
    int age;
    Student() {
        name = "Unknown";
        age = 0;
    }
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.displayInfo();
    }
}