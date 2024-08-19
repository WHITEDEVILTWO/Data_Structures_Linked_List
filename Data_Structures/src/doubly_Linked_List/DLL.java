package doubly_Linked_List;

public class DLL {
	
	private Node head;
	private Node tail;
	
	private int size;
	
	public DLL(){
		
	}
	public DLL(int size){
		this.size=0;
	}
	
	public class Node{
		
		int data;
		Node next;
		Node prev;
		
		public Node(int data) {
			super();
			this.data = data;
		}
		
		public Node(int data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}

		public Node(int data, Node next, Node prev) {
			super();
			this.data = data;
			this.next = next;
			this.prev = prev;
		}	
	}
	public void insertFirst(int data){
		
		Node node=new Node(data);
		if(head==null){
			head=node;
			tail=head;
		}
		else{
		node.prev=null;
		node.next=head;
		head.prev=node;
		head=node;
		}
		size++;
	}
	//-------insert at end ---------
	public void insertAtEnd(int data){
		Node node=new Node(data);
		if(head==null){
			insertFirst(data);
		}
		else{
			node.next=null;
			node.prev=tail;
			tail.next=node;
			tail=node;
		}
		size++;
		
	}
	
	//-------display elements in list
	public void display(){
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.println("END");
	}
	//Reversing the linked list
	public void displyRev(){
		Node temp=tail;
		while(temp!=null){
			System.out.print(temp.data+"-->");
			temp=temp.prev;
		}
		System.out.println("START");
	}
	

}
