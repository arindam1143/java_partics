package dynamic_programming;
//check if equal sum exist of given array
public class equal_sum {

	static boolean find_equalSum(int arr[]) {
		int sum1=0;
		for(int i=0;i<arr.length;i++) {
			sum1=sum1+arr[i];
		}
		if(sum1%2 !=0) {
			//odd
			return false;
		}
		else {
			int sum=sum1/2;
			boolean[][] dp=new boolean[arr.length][sum+1];
			dp[0][0]=true;
			for(int i=0;i<sum+1;i++) {
				if(i==arr[0])
					dp[0][i]=true;
			}
			for(int i=1;i<arr.length;i++) {
				for(int j=0;j<sum+1;j++) {
					if(dp[i-1][j]==true)
						dp[i][j]=true;
					
					else {
						if(j-arr[i]>=0) {
							dp[i][j]=dp[i-1][j-arr[i]];
						}
					}
				}
				
			}
			return dp[arr.length-1][sum];
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {1,2,3,5,7};
System.out.print(find_equalSum(arr));
	}

}
