package Array;
import java.util.*;

public class findsum_hasmap {
	static void subarry(int arr[], int sum) {
		int cursum=0;
		int start=0;
		int end=-1;
		int n=arr.length;
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<n;i++) {
			cursum+=arr[i];
			if(cursum==sum) {
				start=0; 
				end=i;
				break;
			}
			if(map.containsKey(cursum-sum)) {
				start=map.get(cursum-sum)+1;
				end=i;
				break;
			}
			map.put(cursum, i);
		}
		if(end==-1) {
			System.out.println("sum not found");
		}
		else {
			System.out.println(start+" "+end);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr=new int[] {10,15,-5,15,-10,5};
       int sum=5;
       subarry(arr,sum);
	}

}
