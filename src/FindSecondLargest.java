
public class FindSecondLargest {
	public static void main(String[] args) {
		int[] arr = {1,2,4,5,6,7,12,11};
		int len = arr.length;
		int largest = 0;
		int secondLargest = 0; 
		for (int i = 0 ; i < len; i++) {
			if (arr[i] > largest) {
				secondLargest = largest; 
				largest = arr[i];
			}
			else if (arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}
		System.out.println(secondLargest);
	}

}
