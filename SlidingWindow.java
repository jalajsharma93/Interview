//Given an array of integers and a number k.
//Return the highest sum of any k consecutive elements in the array.

class SlidingWindow {
	public static void main(String args[]) {
		// canner sc = new Scanner(system.in);
		int input[] = { 5, -3, 7, -6, 8 };
		int k = 3;
		System.out.println("length :" + input.length);
		System.out.println("sum: " + slidingSum(input, k));

		// for(int i=0;i)
	}

	public static int slidingSum(int inputA[], int k) {
		int temp = 0;
		int sum = 0;
		for (int i = 0; i < (((inputA.length) - k) + 1); i++) {// to optimize
			sum = 0;
			for (int j = 0; j < k; j++) {
				sum = sum + inputA[i + j];
				System.out.println("sum in loop: " + sum);

			}
			temp = Math.max(temp, sum);
		}
		return temp;
	}
}