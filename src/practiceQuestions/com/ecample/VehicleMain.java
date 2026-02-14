package practiceQuestions.com.ecample;

class Vehicle{
	Vehicle(){
	}
	public void display() {
		System.out.println("this ia a vehicle");
	}
}
class Car extends Vehicle{
	Car(){
		
	}
	public void display() {
		System.out.println("this is car");
		super.display();
	}
}
public class VehicleMain {
	public static void main(String[] args) {
		Car c = new Car();
		c.display();
	}
}
