package intro;

public class FindMaxNumber {

	public static void main(String[] args) {
		int[] numbers = {12,15,24,16,18,85};
		
		int maxnum = findMaxNum(numbers);
		System.out.println(maxnum);
		
		
		
	}
	
	public static int findMaxNum(int[] array) {
		int max = array[0];
		
		for (int i = 1; i<array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

}
