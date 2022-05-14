package dynamic_programming;

public class Maxsum_increasingseq {
	static void Maxsum_seq(int[] arr){
        int[] dp=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            dp[i]=arr[i];
        }
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j] && dp[j]+arr[i]>dp[i]){
                    dp[i]=dp[j]+arr[i];
                }
            }
        }
        int max=dp[0];
        for(int i=1;i<arr.length;i++){
            if(dp[i]>max)
            max=dp[i];
            
            
        }
        System.out.println("your long sequence is "+max);
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={7,1,4,8,11,2,14,3};
		Maxsum_seq(arr);
	}

}
