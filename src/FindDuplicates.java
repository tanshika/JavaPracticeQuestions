import java.util.HashMap;

public class FindDuplicates {
	public static void main(String[] args) {
		int[] arr = {1,2,2,4,4,5,6,7,3,4,3,5,6,9};
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int e: arr) {
			if (hm.get(e) == null) 
			{ hm.put(e, 1); }
			else if (hm.containsKey(e)) {
				hm.put(e, hm.get(e) + 1); 
			}
			
		}
		for (int i : hm.keySet()) {
			  System.out.println("key: " + i + " value: " + hm.get(i));
			}
	}
}
