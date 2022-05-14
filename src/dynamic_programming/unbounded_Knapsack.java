package dynamic_programming;
//unbounded knapsack
//its means one value use more time 
public class unbounded_Knapsack {
	static int unbou_Kna(int weight[],int profit[],int total ) {
		int n=weight.length;
		int dp[][]=new int[n][total+1];
		for(int i=0;i<n;i++) {
			for(int j=1;j<=total;j++) {
				int inc=0;
				int exec=0;
				if(weight[i]<=j) {
					inc=profit[i]+dp[i][j-weight[i]];
				}
				if(i>0) {
					exec=dp[i-1][j];
				}
				dp[i][j]=Math.max(inc, exec);
			}
		}
		return dp[n-1][total];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int[] weight= {1,2,3,5};
//int[] profit= {1,4,7,10};
		int[] weight= {3,4,6,5};
		int[] profit= {2,3,1,4};
int capacity=8;
System.out.println(unbou_Kna(weight,profit,capacity));
	}

}
