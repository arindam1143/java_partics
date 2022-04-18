package Array;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
public class reduceDuplicate_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr={1,2,2,3,5,8,9,7,8,100,1};
	        ArrayList<Integer> obj=new ArrayList<>();
	        int p=0;
	        for(int i=0;i<arr.length;i++){
	            for(int j=0;j<arr.length;j++){
	                if(arr[i]==arr[j]){
	                    p++;
	                    if(p>1)
	                    break;
	                }
	                
	            }
	            if(p==1){
	                obj.add(arr[i]);
	            }
	            p=0;
	        }
	        //int s=obj.size();
	        //for(int i=0;i<s;i++){
	            System.out.print(obj+" ");
	        //}

	}

}
