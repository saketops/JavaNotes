package collections;
import java.util.ArrayList;
import java.util.Set;
import java.util.List;
import java.util.HashSet;

public class CollectionFirstProgram {
	public static void main(String[] args) {
		List<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(10);
		al.add(null);
		al.add(null);
		System.out.println(al);
		System.out.println(al.get(2));//random access
		//gets printed orderly
		//null insertion possible
		//stores duplicate
		Set<Integer> set=new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10);
		set.add(null);
		set.add(null);
		System.out.println(set);
		//printed unorderly
		//null insertion possible
		//does not store duplicate
	}

}
