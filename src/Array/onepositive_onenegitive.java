package Array;

//Not completed

import java.util.Arrays;

public class onepositive_onenegitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {9,-2,5,7,-1,5,7,-5,-7};
		Arrays.sort(arr);
		int b=0;
		int i=0;
		while(b++<arr.length-1) {
			if(arr[b]<0) {
				b++;
				i++;
			}
		}
		
		int j=0;
		int[] newarr=new int[arr.length];
		int k=0;
		boolean p=true;
		int t=0;
		while(t++<arr.length-1) {
			if(p==true) {
				newarr[k]=arr[i];
				k++;
				i++;
				p=false;
				while(arr[i]<0) {
					i++;
				}
			}
			else {
				newarr[k]=arr[j];
				k++;
				j++;
				p=true;
				while(arr[j]>0) {
					j++;
				}
			}
		}
		for(int z=0;z<arr.length-1;z++) {
			System.out.println(arr[z]+" ");
		}

	}

}
