/* Create a Vehicle class with a method start(). Make a Car and Bike class that extend Vehicle 
and override start() with different messages. */
class Vehicle {
    void start() {
        System.out.println("Starting...");
    }
}
class Car extends Vehicle {}
class Bike extends Car {}
public class Inheritance_vehicle {
     public static void main(String[] args) {
        Bike bike = new Bike();
        bike.start();
     }

}