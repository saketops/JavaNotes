package l3methods;

public class TestProtected {

		public static void main(String[] args) {
			/*TestPro testPro=new TestPro();//parent class obj
			testPro.printPro();*/

			TestProAgain t =new TestProAgain();//child class object
			t.printPro();


			/*DemoPro demopro= new DemoPro();//child class obj
			demopro.printPro();*/


		}

	}

	class TestPro
	{
	protected void printPro() {
		System.out.println("hello pro bhai");

	}


	}
	// a lot of confusion got created in protected mode due to bad naming conventions:
	// session 11 40-50 minutes

