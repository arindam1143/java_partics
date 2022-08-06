package coding;
import java.util.*;


public class kth_Smallestelement {
	static int find(int arr[],int len,int k) {
		int count=1;
		int min=arr[0];
		//int flag=0;
		for(int i=0;i<len;i++) {
			if(count==k)
				return arr[i];
			
			if(min<arr[i]) {
				count++;
				min=arr[i];
			}
			if(count==k)
				return arr[i];
			
		}
		
		return -1;
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {1,2,3,1,2,3,5,1,7,9};
Arrays.sort(arr);
int len=arr.length;
int k=6;
int res=find(arr,len,k);
System.out.print(res);
	}

}
