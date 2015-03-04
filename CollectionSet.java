import java.util.*;

class CollectionSet{
	public static void main(String[] args) {
		int count[] = {34,33,22,14,23,12};
		Set<Integer> newSet = new HashSet<Integer>();
		try{
			for(int i = 0;i<5;i++){
				newSet.add(count[i]);
			}
			System.out.println("the set elements are \t" +newSet);
			System.out.println(newSet.contains(33));
		}
		catch(Exception e){

		}
	}
}