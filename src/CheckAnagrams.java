import java.util.Arrays;

public class CheckAnagrams {
	public static void main(String[] args) {
		String str1 = "cato";
		String str2 = "actw";
		
		char[] str1Char = str1.toCharArray();
		char[] str2Char = str2.toCharArray();
		
		if (str1Char.length == str2Char.length) {
			Arrays.sort(str1Char);
			Arrays.sort(str2Char);
			boolean result = Arrays.equals(str1Char, str2Char);
			if (result == true) {System.out.println("Strings are anagrams");}
			else {System.out.println("Strings are not anagrams");}
			
		}
		else {System.out.println("Strings are not anagrams");}
		}

}
