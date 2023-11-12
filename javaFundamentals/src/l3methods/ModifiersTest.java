package l3methods;

public class ModifiersTest {
	// functions with access modifiers

	// access modifier: visibility
	//public- all over project
	//protected - same package+child class(different package)
	//default- same package
	//private-within same class only




		public static void main(String[] args) {

			//ModifiersTest n = new ModifiersTest();
			//n.printHello();


		}
		public void printHello() {
			System.out.println("hello saket");
		}

	}
	class TestModi  {
		public void callHello() {

		ModifiersTest m= new ModifiersTest();
		m.printHello();
		System.out.println(m);
		}
	}



