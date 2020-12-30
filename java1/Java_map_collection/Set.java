import java.util.*;

public class Set{
	public static void main(String[] args) {
		//HashSet
		HashSet<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		System.out.println(set1);
		
		//LinkedHashSet
		LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
		set2.add(2);
		set2.add(1);
		set2.add(3);
		System.out.println(set2);
		
		//TreeSet
		TreeSet<Integer> set3 = new TreeSet<>();
		set3.add(2);
		set3.add(1);
		set3.add(3);
		System.out.println(set3);
	}
}