package sorting;

import java.util.Scanner;

public class quicksort {
	static void quickSort(int arr[],int low,int hig) {
		if(low<hig) {
			int pivot=position(arr,low,hig);
			quickSort(arr,low,pivot-1);
			quickSort(arr,pivot+1,hig);
		}
	}
	static int position(int arr[],int low,int hig) {
		int pivot=arr[hig];
		int i=low-1;
		for(int j=low;j<hig;j++) {
			if(arr[j]<pivot) {
				i++;
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
			
		}
		
		int temp=arr[hig];
		arr[hig]=arr[i+1];
		arr[i+1]=temp;
		return (i+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int low=0;
		int[] arr=new int[n];
		int hig=arr.length;
		for(int i=0;i<n;i++) {
			arr[i]=obj.nextInt();
		}
		quickSort(arr,low,hig-1);
		for(int i=0;i<hig;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
