package l3methods;

public class SiyaRam {
	public static void main(String[] args) {
		ram();//method calling
		//new
		//create object
		SiyaRam s = new SiyaRam();
		s.printSiyaRam();
		//concept of static and nonstatic calling

	}

public static void ram() {//method creation
	System.out.println("Jai Shree Ram");
}
}
//note - both method in same class then we can call them directly


//when we have methods in different class or package then we call the method
// by using object
class SiyaRam{
	public void printSiyaRam() {
		System.out.println("ram ram");
	}

}
