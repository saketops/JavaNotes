package l3methods;

public class AddNum {
	// methods
		public static void main(String[] args) {
			int x=10;
			int y=10;

			int res= addNumbers(x,y);
			System.out.println(res);

			//public method
			SiyaRam s = new SiyaRam();
			s.printSiyaRam();


			//private method call
			AddNum n = new AddNum();
			n.printSiyaRam();

		}


		public static int addNumbers(int a, int b) {

			int c= a+b;
			return c;


		}

	}



