package L5oops;

abstract class AbstractionTest{
	abstract int sum();
	public void print() {
		System.out.println("jai shree ram...");
	}

	}
class Test extends AbstractionTest{
	@Override
	int sum() {
		System.out.println("hello sum");
		return 10;
	}
}
public class AbstractionDemo{
	public static void main(String[] args) {
		Test t=new Test();
		int res=t.sum();
		System.out.println(res);
	}

}

