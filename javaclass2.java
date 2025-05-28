/* Modify the Student class to include a parameterized constructor that takes name and age as arguments. 
Create two student objects—one using the default constructor and one using the parameterized constructor. */
class Student {
    String name;
    int age;
    Student() {
        name = "hehe";
        age = 100;
    }
    Student(String newName, int newAge) {
        name = newName;
        age = newAge;
    }
    void displayInfo() {
        System.out.println("Name: " + name +", Age: " + age);
    }
}
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("nana",1);
        student1.displayInfo();
        Student student2 = new Student();
        student2.displayInfo();
    }
}