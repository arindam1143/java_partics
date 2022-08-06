package codequecent;

//input 6 {7,3,3,1,1,9}
//output= 6,4,2,1
	import java.util.ArrayList;
	//import java.util.Scanner;
	import java.util.*;

	public class reduceZERO {
	    static class Result{
	    static ArrayList<Integer> reduceZero(ArrayList<Integer> arr){
	        ArrayList<Integer> list=new ArrayList<>();
	        Collections.sort(arr);
	        int ele=arr.size();
	        int count =0;
	        for(int i=0;i<arr.size();i++){
	            count=1;
	            while(i+1<arr.size() && arr.get(i)==arr.get(i+1)){
	                count++;
	                i++;
	            }
	            list.add(ele);
	            ele=ele-count;
	        }
	        return list;
	        
	    }
	}
	    public static void main(String[] args){
	        Scanner obj=new Scanner(System.in);
	        int size=obj.nextInt();
	        ArrayList<Integer> arr =new ArrayList<Integer>();
	        for(int i=0;i<size;i++){
	            arr.add(obj.nextInt());
	        }
	        ArrayList<Integer> list2= (Result.reduceZero(arr));
	        System.out.println(list2);
	    }
	}



	
