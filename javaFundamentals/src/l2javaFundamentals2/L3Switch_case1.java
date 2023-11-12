package l2javaFundamentals2;
// if u use switch , case bhi lagana padega
public class L3Switch_case1 {
public static void main(String[] args) {
	//case value will be constant always
	int x=9;
	switch(x)
	{
	case 10:
	System.out.println("yes x=10");
	break;

	//case can't be duplicated
	case 9:
		System.out.println("yes x=9");
		break;
		//break removes condition from switch,
		//apply it after every true statement
	default:
		System.out.println("this default");
	}
}
}
/*if u dont apply break after true statement, false will also get executed*/
//upar ke false doesnt matter(compiler will directly jump to true one)