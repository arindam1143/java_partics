package LinkedList;

public class findloop_linkedlist {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	//static class addNode{
		static Node head=null;
		static Node tail=null;
	public static void insert(int data) {
		Node obj=new Node(data);
		
		if(head==null) {
			head=obj;
			tail=obj;
		}
		else {
			tail.next=obj;
			tail=obj;
		}
		//tail.next=head.next.next;
	}
	public static void display() {
		Node temp=head;
		if(temp==null) {
			System.out.print("your linked list is empty");
		}
		while(temp !=null) {
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
	}
	
	//}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//addNode obj1=new addNode();
		findloop_linkedlist obj1=new findloop_linkedlist();
		obj1.insert(5);
		obj1.insert(10);
		obj1.insert(15);
		obj1.insert(20);
		obj1.insert(50);
		obj1.insert(100);
		obj1.display();
		

	}

}
