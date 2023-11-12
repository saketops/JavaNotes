package l3methods;

public class Animal {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.makeNoise();

	}



	protected void makeNoise(){
		System.out.println("animal makes noise");
	}

}
class Dog extends Animal{
	@Override
	protected void makeNoise() {
		System.out.println("dog bark");
	}
}
