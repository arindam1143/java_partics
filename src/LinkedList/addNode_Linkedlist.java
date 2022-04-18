package LinkedList;

public class addNode_Linkedlist {
static class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
static Node head=null;
static Node tail=null;
static void insertNode(int data) {
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

//add  node linked list in last
static Node addLast(Node head,int data) {
	Node last=new Node(data);
	Node temp=head;
	if(temp==null) {
		System.out.println("your linked list is empty");
	}
	while(temp.next !=null) {
		temp=temp.next;
	}
	
	temp.next=last;
	temp=last;
	
	return head;
}
//add node first in linked list
static Node addfirst(Node head,int data) {
	Node first=new Node(data);
	Node temp=head;

	if(temp==null) {
		head=first;
		tail=first;
	}

   //.next=head;
    temp=first;
    temp.next=head;
	return temp;
}
//add any position
static Node addany(Node head,int data,int pos){
    pos=pos-1;
    Node any=new Node(data);
     int count=1;
    Node temp=head;
    if(temp==null){
        temp=any;
        tail=any;
    }
    while(temp !=null){
        
        if(count==pos){
            Node a=temp.next;
            temp.next=any;
            any.next=a;
            return temp ;
        }
        System.out.print(temp.data+" ");
        count++;
        temp=temp.next;
    }
    return head;
    
    
}
static void dispaly() {
	
	Node temp=head;
	
	if(temp==null) {
		System.out.println("your lilked is empty");
	}
	else {
		while(temp !=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addNode_Linkedlist obj1=new addNode_Linkedlist();
		System.out.println(head);
		obj1.insertNode(5);
		System.out.println(head);
		obj1.insertNode(15);
		obj1.insertNode(25);
		obj1.insertNode(35);
		obj1.insertNode(45);
		obj1.dispaly();
		System.out.println("after add the node in last i linked list");
		Node a=obj1.addLast(head,55);	
		obj1.dispaly();
		System.out.println();
		System.out.println(head);
		System.out.println("after add first node in linked list");
		head=obj1.addfirst(head, 1);
		System.out.println();
		System.out.println(head);
		obj1.dispaly();
		System.out.println();
		head=addany(head,100,3);
		
		obj1.dispaly();
		}

}
