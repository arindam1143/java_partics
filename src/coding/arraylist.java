package coding;
import java.util.*;
public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		list.add(500);
		for(int i=0;i<10;i++) {
			list.add(i+5);
		}
		list.add(-5);
		list.add(500);
		for(int i=0;i<10;i++) {
			list.add(i+50);
		}
		//list.add(500);
		
		
		System.out.print(list.get(0));
	}

}
