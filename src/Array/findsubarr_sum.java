package Array;
//find a sub array which is sum=0;

//not completed

public class findsubarr_sum {
	static boolean findsubarr(int arr[]) {
		
		int n=arr.length;
		int sum=0;
		int p=0;
		int[] newarr=new int[n];
		for(int i=0;i<n;i++) {
			p++;
			newarr[i]=arr[i];
			if(newarr[i]==0)
				return true;
			
			for(int j=1;j<n;j++) {
				p++;
				sum+=arr[j];
				if(p>1) { 
					if(sum==arr[j])
					return true;
				}
				
			}
		}
		
		
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] arr=new int[] {4,4};
    boolean p=findsubarr(arr);
    System.out.println(p);
	}

}
