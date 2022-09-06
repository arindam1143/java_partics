package partice;
//name is wrong this topic is ***hashset****;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Iterator;
public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TreeSet<Integer> set=new TreeSet<>();
	   HashSet<Integer> set=new HashSet<>();
		set.add(100);
		set.add(10);
		set.add(1);
		set.add(2);
		set.add(1);
		set.add(8);
		set.add(5);
		set.add(2);
		set.add(4);
		set.add(-5);
		set.add(-1);
		set.add(0);
		
		set.add(-5);
		set.add(10);
		set.add(10);
		set.add(2);
		set.add(11);
		set.add(51);
		set.add(21);
		set.add(41);
		set.add(-51);
		
		System.out.print(set);
		System.out.println();
		System.out.println(set.size());
		set.remove(21);
		System.out.println(set);
		System.out.println(set.contains(2));//return ture or false 
		//Iterator opraction 
		Iterator it=set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
		

	}

}
