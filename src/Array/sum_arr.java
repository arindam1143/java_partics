package Array;

public class sum_arr {
	 static boolean sumarr(int arr[],int terget){
	        int i=0;
	        int j=arr.length-1;
	        while(i<j){
	            int sum=arr[i]+arr[j];
	            if(sum==terget){
	                return true;
	            }
	            else if(sum<terget){
	                i++;
	            }
	            else if(sum>terget){
	                j++;
	            }
	        }
	        return false;
	    }

	public static void main(String[] args) {
		//sum of array in small to high
		int arr[]={1,2,3,4,5,6,7,8,100};
	       int terget=101;
	       System.out.println(sumarr(arr,terget));

	}

}
