package MyInterface;

interface MyInterface{
	int MAX_VALUE =100;
	void hello1(); //abstract method
	int hello2(); // abstract method
	
	//java 1.8
	default void m2()
	{
		System.out.println("kaise ho");
	}
}

 class DemoAbs implements MyInterface{

	@Override
	public void hello1() {
		System.out.println("ram");
		// TODO Auto-generated method stub
		
	}

	@Override
	public int hello2() {
		System.out.println("sita");
		// TODO Auto-generated method stub
		return 0;
	}
	
}

public class MyClass {
	public static void main(String[] args) {
		DemoAbs demoAbs=new DemoAbs();
		System.out.println(DemoAbs.MAX_VALUE);
		demoAbs.hello1();
		demoAbs.m2();
		
		//interface ka object nai ban skta
		//MyInterface myInterface =new MyInterface();
		
		}

}
