package L5oops;

//one class can have only one public method
class PolyTest{
	//overloading- both methods having same name and different arguments- different datatype,different number of parameters
	public void print(int a)
	{
		System.out.println("heyy a"+a);
	}
	public void print(float a,int b)
	{
		System.out.println("heyy a"+a+" "+b);
	}

}
public class OverloadingDemo {
	public static void main(String[] args) {
	PolyTest test=	new PolyTest();
	test.print(10);
	test.print( 20,19);
	}

}
