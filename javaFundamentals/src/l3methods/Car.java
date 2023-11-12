package l3methods;

public class Car {
	public static void main(String[] args) {
		Car car = new Car();
		car.startEngine();//public method
		car.stopEngine();//private
		car.accEngine();
		car.horn();

	}
	public void startEngine() {
		System.out.println("engine start...");
	}


private void stopEngine() {
	System.out.println("engine stop...");
}
protected void accEngine() {
	System.out.println("acc engine...");
}
void horn() {
	System.out.println("pee");
}
}
