public class demo {
    
}
class Solution {
	public static int findSecondLargest(int n, int[] arr) {
		// Write your code here.
		int max = Integer.MIN_VALUE;
    	int secondmax = Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
			
			int ele=arr[i];
			if(ele>max){
				secondmax=max;
				max=ele;
			}else if(ele > secondmax && ele < max){
				secondmax=ele;
			}
		}
		return secondmax;
	}
	public static void main(String[] args) {
		int arr[]={92,-47,-70,-42,98,43};
		System.out.println(findSecondLargest(6, arr));
	}
}
