package dynamic_programming;
//find if there exists a subset with the given sum
public class subset_givenSum {
static boolean subset(int[] arr,int sum) {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {7,1,4,8,11,2,14,3};
System.out.print(subset(arr,13));
	}

}
