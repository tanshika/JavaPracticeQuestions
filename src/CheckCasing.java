public class CheckCasing {
	public static void main(String[] args) {
		String str = "Tanshika";
		char[] str2 = str.toCharArray();
		int upperCase = 0; 
		int lowerCase = 0;
		for (char e: str2 ) {
			if(Character.isUpperCase(e)) {upperCase++;}
			else if(Character.isLowerCase(e)) {lowerCase++;}
		}
		System.out.println("Uppercase "+upperCase+" Lowercase "+lowerCase);
		}
}
