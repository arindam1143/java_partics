package dynamic_programming;
//minimum difference of subarray
public class mini_differOfsubarray {
static int mini_dif(int[] arr) {
	int sum1=0;
	for(int i=0;i<arr.length;i++) {
		sum1=sum1+arr[i];
	}
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
	int posible=0;
	boolean ans= dp[arr.length-1][sum];
	for(int col=sum;col>0;col--) {
		if(dp[arr.length-1][col]==true) {
			posible=col;
			break;
		}
	}
	int anosum=sum1-posible;
	return Math.abs(posible-anosum);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3,5,13};
System.out.println(mini_dif( arr));
	}

}
