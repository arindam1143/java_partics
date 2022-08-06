package coding_Ninja;
import java.util.HashMap;
//codinj ninja module-hashmap 1st question 
// Maximum Frequency Number
public class maxfec_INarray {
         static int maxfec(int arr[]){
	        HashMap<Integer,Integer> obj=new HashMap<>();
	        for(int i=0;i<arr.length;i++){
	            if(obj.containsKey(arr[i])){
	                int val=obj.get(arr[i]);
	                val++;
	                obj.put(arr[i],val);
	            }
	            else{
	            obj.put(arr[i],1);
	            }
	        }
	        
	        int maxfec=0;
	        int max=Integer.MIN_VALUE;
	     for(int i : arr){
	         if(maxfec<obj.get(i))
	         {
	             maxfec=obj.get(i);
	             max=i;
	             
	             
	             
	         }
	     }
	     return max;
	    }
	    public static void main(String[] args){
	        int arr[]={1,1,1,1,1,1,1,1,4,5,4,7};
	        int a=maxfec(arr);
	        System.out.print(a);
	        
	    }
	}
//return the element which are present in array in max time
