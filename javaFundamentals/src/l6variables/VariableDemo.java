package l6variables;


	class VariableTest{
	int a=10;//instance variable
	static int b=2211;//static variable
	public void RadhaRadha() {
		String s="jai shree ram";//local variable
		System.out.println("jai shree krishna");
		System.out.println(a);

		//instance variable not able to use in static area
		// static variable can be used in instance area
		System.out.println(b);
		System.out.println(s);

	}




	}
	public class VariableDemo{


		public static void main(String[] args){
			VariableTest v1=new VariableTest();
			v1.RadhaRadha();
			v1.a=1000;
			VariableTest.b=999;
			System.out.println("-----------------");
			v1.RadhaRadha();

			VariableTest v2=new VariableTest();
			v2.RadhaRadha();




		}

	}




