import java.util.*;

class Collection{
	public static void main(String[] args) {
		List jp = new ArrayList();
		jp.add("hi");
		jp.add("hello");
		Map one = new HashMap();
		one.put("jp" , jp);
		System.out.println();
		System.out.println(" Map Elements are");
		System.out.println(" \t"+one);
		Set<String> two = one.keySet();
		for(String a:two){

			
			// List<String> another = one.get(a);
			System.out.println("nothing to see except true or false "+one.get(a));
		}
		System.out.println("this set elements are "+two);
	}
}