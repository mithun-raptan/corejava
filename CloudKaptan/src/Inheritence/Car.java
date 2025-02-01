package Inheritence;

public class Car extends Vehicle {
	 int doors;

	    Car(String brand, int speed, int doors) {
	        super(brand, speed);
	        this.doors = doors;
	    }

	    void displayCarInfo() {
	        displayInfo();
	        System.out.println("Doors: " + doors);
	    }

}
