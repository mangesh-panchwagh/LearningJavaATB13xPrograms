package ex_16_Arrays;

public class Lab153_Arrays_Max_Min {

	public static void main(String[] args) {

		int[] array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };

		// Arrays.sort(array);
		// System.out.println(array[array.length-1]);

		int max_number = give_me_max(array);
		int min_number = give_me_min(array);

		System.out.println(max_number);
		System.out.println(min_number);
	}

	static int give_me_max(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}	

	static int give_me_min(int[] array) {
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}
}
