package dynamic_programming;

public class Long_seqence {
	
	//longest increasing subsequence length
	
	    static void Long_seq(int[] arr){
	        int[] dp=new int[arr.length];
	        for(int i=0;i<arr.length;i++){
	            dp[i]=1;
	        }
	        for(int i=1;i<arr.length;i++){
	            for(int j=0;j<i;j++){
	                if(arr[i]>arr[j] && dp[j]+1>dp[i]){
	                    dp[i]=dp[j]+1;
	                }
	            }
	        }
	        int max=dp[0];
	        for(int i=1;i<arr.length;i++){
	            if(dp[i]>max)
	            max=dp[i];
	            
	            
	        }
	        System.out.println("your long sequence is "+max);
	        for(int i=1;i<arr.length;i++){
	            System.out.print(dp[i]+" ");
	            
	            
	        }
	    }
	    public static void main(String[] args){
	        int[] arr={7,1,4,8,11,2,14,3};
	        Long_seq( arr);
	    }
	}
	/*
	longest subsequence meance not continious 
	find the long increasing order in your arr

	*/

