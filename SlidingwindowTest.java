//

class SlidingwindowTest{
	public static void main(String args[]){
		int arr[] = {1, 5, 2, -3, -7,-1};
		int k=3;
		System.out.println("sum: "+slidingSum(arr,k));
	}
	public static int slidingSum(int arr[], int k){
		int highsum=0;
		int sum = 0;
		int n = arr.length;
		int win_sum =0;
		for(int i= 0;i<k;i++){
			sum = sum+arr[i];
		}
		win_sum=sum;
		for(int i= 0;i<(n-k);i++){
			win_sum=(win_sum-arr[i])+arr[i+k];
			highsum=Math.max(highsum,Math.max(win_sum,sum));
		}
	return highsum;
	}
}