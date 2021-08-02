class SlidingwindowTests{
	public static void main(String args[]){
		int arr[] = {1, 5, 2, 3, 7, 1};
		int k=3;
		System.out.println("sum: "+slidingSum(arr,k));
	}
	public static int slidingSum(int arr[], int k){
		int highsum=0;
		int n = arr.length;
		int win_sum =0;
		int left =0;
		int right =0;
		
		
		while(right<n){
			win_sum+=arr[right];
			right+=1;
			if(right-left==k){
				highsum = Math.max(highsum,win_sum);
				win_sum -= arr[left];
				left +=1;
			}
		}
		return highsum;
	}
}