package queue;

import java.util.ArrayList;

public class priority_Queue {

	static class pq{
		ArrayList<Integer> arr;
		
		pq(){
			arr=new ArrayList<>();
		}
	
	public void add(int val) {
		arr.add(val);
		upheapify(arr.size()-1);
	}
	public void upheapify(int i) {
		if(i==0)
			return;
		int pa=(i-1)/2;//find parent of any child (child index-1)/2;
		
		
		if(arr.get(i)<arr.get(pa)) //this line for Min heap
		
		{
			swap(i,pa);
			upheapify(pa);
		}
	}
	public void swap(int i,int pa) {
		int ivalue=arr.get(i);
		int pavalue=arr.get(pa);
		arr.set(i, pavalue);
		arr.set(pa, ivalue);
	}
	public void Remove() {
		if(this.size()==0) {
			System.out.println("ds is empty");
			return;
     }
		swap(0,arr.size()-1);
		arr.remove(arr.size()-1);
		downheapify(0);
	}
	public void downheapify(int i) {
		if(i>=arr.size()-1) 
			return;
			
			int min=i;
			int li=2*i+1;//find left child
			
			int ri=2*i+2;//find right child
			
			if(li<arr.size() && arr.get(li)<arr.get(min)) {
				min=li;
			}
			if(ri<arr.size() && arr.get(ri)<arr.get(min)) {
				min=ri;
			}
			if(min !=i) {
				swap(i,min);
				downheapify(min);
			}
		
	}
	public int peek() {
		if(this.size()==0) {
			System.out.println("your ds is empty");
			return -1;
			
		}
		int val=arr.get(0);
		return val;
	}
	public int size() {
		return arr.size();
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pq obj=new pq();
		obj.add(10);
		obj.add(7);
		obj.add(3);
		obj.Remove();
		System.out.println(obj.peek());
		

	}

}
