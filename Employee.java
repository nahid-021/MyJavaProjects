/* Create an Employee class with id, name, and salary as private fields. 
Provide proper getter and setter methods to access them. */
class Employee {
    private int id;
    private String name;
    private int salary;
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getSalary() {
        return salary;
    }
    void displayInfo() {
        System.out.println("Id: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setId(1234);
        employee.setName("Blah");
        employee.setSalary(5000);
        employee.displayInfo();
    }
}