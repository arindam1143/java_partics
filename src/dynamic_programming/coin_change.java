package dynamic_programming;
//min coin change problem unbounded
//for Unbounded 
public class coin_change {
static int minCoin_change(int[] coin,int sum) {
	int n=coin.length;
	int[][] dp=new int[n][sum+1];
	for(int i=0;i<n;i++) {
		dp[i][0]=0;
	}
	for(int i=0;i<n;i++) {
		for(int j=1;j<=sum;j++) {
			int inc=Integer.MAX_VALUE;
			int exec=Integer.MAX_VALUE;
			
			if(coin[i]<=j) {
				inc=1+dp[i][j-coin[i]];
			}
			if(i>0) {
				exec=dp[i-1][j];
			}
			dp[i][j]=Math.min(inc, exec);
		}
	}
	return dp[n-1][sum];
}
//for bounded 
static int bounded_minCoin_change(int[] coin,int sum) {
	int n=coin.length;
	int[][] dp=new int[n][sum+1];
	for(int i=0;i<n;i++) {
		dp[i][0]=0;
	}
	for(int i=0;i<n;i++) {
		for(int j=1;j<=sum;j++) {
			int inc=Integer.MAX_VALUE;
			int exec=Integer.MAX_VALUE;
			if(i==0 && j==coin[i])
			dp[i][j]=1;
			if(1 !=0 && coin[i]<=j) {
				inc=1+dp[i][j-coin[i]];
			}
			if(i>0) {
				exec=dp[i-1][j];
			}
			dp[i][j]=Math.min(inc, exec);
		}
	}
	return dp[n-1][sum];
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3};
int sum=100;
System.out.println(minCoin_change(arr,sum));
System.out.println(bounded_minCoin_change(arr,sum));
	}

}
