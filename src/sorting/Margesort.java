//use devide and concare rule;
package sorting;
import java.util.Scanner;
import java.util.*;
import java.io.*;
public class Margesort {
	public static void divide(int arr[],int low,int hig) {
		if(low<hig) {
			int mid=(low+hig)/2;
			divide(arr,low,mid);
			divide(arr,mid+1,hig);
			MargeArray(arr,low,hig,mid);
		}
	}
	public static void MargeArray(int arr[],int low,int hig,int mid) {
		int len1=mid-low+1;
		int len2=hig-mid;
		int[] arr1=new int[len1];
		int[] arr2=new int[len2];
		for(int i=0;i<len1;i++) {
			arr1[i]=arr[low+i];
		}
		for(int j=0;j<len2;j++) {
			arr2[j]=arr[mid+1+j];
		}
		int a=0;
		int b=0;
		int c=low;
		while(a<len1 && b<len2) {
		
		if(arr1[a]<=arr2[b]) {
			arr[c]=arr1[a];
			a++;
			c++;
		}
		else {
			arr[c]=arr2[b];
			c++;
			b++;
		}
		}
		while(a<len1) {
			arr[c]=arr1[a];
			c++;
			a++;
		}
		while(b<len2) {
			arr[c]=arr2[b];
			c++;
			b++;
		}
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
		divide(arr,low,hig-1);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
