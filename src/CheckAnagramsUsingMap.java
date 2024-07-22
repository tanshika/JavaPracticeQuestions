import java.util.HashMap;

public class CheckAnagramsUsingMap {
	public static void main(String[] args) {
		String str1 = "acthh";
		String str2 = "hcath";
		
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		HashMap<Character, Integer> h1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> h2 = new HashMap<Character, Integer>();
		
		for (char e1: ch1) {
			if (h1.containsKey(e1)) {
				h1.put(e1, h1.get(e1)+1);
			}
			else { h1.put(e1,1);}
		}
		
		for (char e2: ch2) {
			if (h2.containsKey(e2)) {
				h2.put(e2, h2.get(e2)+1);
			}
			else { h2.put(e2,1);}
		}
		
		boolean result = h1.equals(h2); 
		if (result == true) { System.out.println("Strings are Anagrams");}
		else {System.out.println("Strings are not Anagrams");}
	}

}
