package coding_Ninja;
//remove duplicate from an array 
import java.util.*;
import java.io.*;
public class Remove_duplicate {
// this finction is true but answer is sorted order 
/*static void removeDup(int arr[]) {
	HashMap<Integer,Boolean> map=new HashMap<>();
	for(int i=0;i<arr.length;i++) {
		if(map.containsKey(arr[i])) {
			continue;
		}
		map.put(arr[i],true);
		
		
		
	}
	System.out.println(map+" ");
}*/
	public static ArrayList<Integer> removedup(int arr[]){
		ArrayList<Integer> output=new ArrayList<>();
		HashMap<Integer,Boolean> map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i]))
				continue;
			
			output.add(arr[i]);
			map.put(arr[i], true);
		}
		return output;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr=new int[] {1,3,2,2,6,5,7,2,5,4};
       //removeDup( arr);
       ArrayList<Integer> output=removedup(arr);
       System.out.println(output);
	}

}
