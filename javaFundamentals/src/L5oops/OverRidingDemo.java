package L5oops;
class OverRiding{
	protected void printRam() {
		System.out.println("ram");

	}
}

class OverRidingTest extends OverRiding{
	@Override
	protected void printRam() {
		System.out.println("jai shree");

	}
	}



public class OverRidingDemo {
	public static void main(String[] args) {
		OverRiding OverRiding= new OverRiding();
		OverRiding.printRam();//parent

		OverRidingTest OverRidingTest=new OverRidingTest();
		OverRidingTest.printRam();//child

		OverRiding test = new OverRidingTest();
		//in up line the child is not capable of handling parent's object, so only parent can do it
		test.printRam();//parent


}
}