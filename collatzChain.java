import java.util.*;

class CollatzChain {
	static Map<Integer, Integer> collatzMap = new HashMap<Integer, Integer>();
	static Set<Integer> set = new HashSet<Integer>();
	public static void main(String[] args) {
		int chainLength;
		int longestChainLength = 0;
		int startOfLongestChain = 0;
		int max = 10000000;

		for (int i = max; i >1; i--) {
			if(!set.contains(i)){
				chainLength = chainLength(i);
				collatzMap.put(i, chainLength);
				if (longestChainLength < chainLength) {
					longestChainLength = chainLength;
					startOfLongestChain = i;
				}
			}
		}
		
		System.out.println("Longest chain length upto " + max + " is " + longestChainLength + " and it starts at " + startOfLongestChain);
	}

	public static int chainLength(int start) {
		List<Integer> chain = new ArrayList<Integer>();
		chain.add(start);
		while (start > 1) {
			if(collatzMap.containsKey(start))
				return chain.size() + collatzMap.get(start);
			if (start % 2 == 0)
				start /= 2;
			else {
				start *= 3;
				start += 1;
			}
			chain.add(start);
			set.add(start);
		}
		return chain.size();
	}
}
