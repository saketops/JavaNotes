package l1javaFundamentals;

public class L5JavaBitwise {
	public static void main(String[] args) {
		int a=300;
		int b=3;
		System.out.println(a&b);//AND
		System.out.println(a|b);//OR
		System.out.println(a^b);//XOR
		System.out.println(a<<b);//LeftShift
		System.out.println(a>>b);//RightShift

	}

}
/*in leftshift just add those many zeros and after 8 bits system shows different number bcoz of version difference*/

//shortcut for leftshift-->*a with power of 2

/*in Rightshift just minus last those many digits*/

//Operator Precedence : left to right