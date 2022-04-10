package LinkedList;
import java.util.Scanner;
public class Simple_linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		creatNode obj1=new creatNode();
		for(int i=0;i<len;i++) {
			obj1.addNode(sc.nextInt());
		}
		//obj1.addNode(5);
		//obj1.addNode(10);
		
		obj1.display();

	}

}
class Node{
	int data;
	Node next;
	public  Node(int data) {
		this.data=data;
		this.next=null;
	}
}
class creatNode{
	Node head=null;
	Node tail=null;
	public void addNode(int data) {
		Node obj=new Node(data);
		if(head==null) {
			head=obj;
			tail=obj;
		}
		else {
			tail.next=obj;
			tail=obj;
		}
	}
		public void display() {
			Node current=head;
			if(current==null) {
			System.out.print("your link list is empty ");
			}
			else {
				while(current !=null) {
					System.out.println(current.data+" ");
					current=current.next;
				}
			}
		}
		
	
}
