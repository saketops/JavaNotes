package L5oops;

 class Dhani{
	//parent class
	//papa
	 //int a=10;
	// final int b=20;//final will fix its value
	public void house() {
		System.out.println("normal house..");

	}

}
class DhanikaBeta extends Dhani{
	//child class
	@Override
	public void house() {
		System.out.println("modified house..");

}

public class InheritanceDemo{

	public static void main(String[] args) {
		Dhani dhani=new Dhani();
		dhani.house();

	DhanikaBeta Beta =new DhanikaBeta();
	Beta.house();
	//System.out.println(Beta.a);
	//Beta.b=30;//can't change due to final
	//System.err.println(Beta.b);

	}


}}