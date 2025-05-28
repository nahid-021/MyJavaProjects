/* Create a Person class with name and age. Make a Student class that extends Person and adds studentID. 
Display all details. */
class Person {
    String name;
    int age;
}
class Student extends Person {
    int studentID;

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ",Student ID: " + studentID);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Nahid";
        student.age = 21;
        student.studentID = 1234;
        student.displayInfo();
    }
}