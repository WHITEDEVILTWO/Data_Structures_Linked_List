package Singly_Linked_List;

// Implementing Linked list - Designing 
public class LL {
	
	private Node head;
	private Node tail;
	
	private int size;
	
	public void LL(){
		this.size=0;
	}
	
	public class Node{
		
		private int data;
		private Node next;
		
		public Node(int data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}
		public Node(int data) {
			super();
			this.data = data;
		}	
	}
	//---------------------------------------------------------------------------------	
	public void insertAtFirst(int data){
		Node node = new Node(data);
		if(head==null){
			head=node;
		}
		else{
		node.next=head;
		head=node;
		}
		if(tail==null){
			tail=head;
		}
		size++;
	}
	//---------------------------------------------------------------------------------
	public void insertAtEnd(int data){
		Node node = new Node(data);
		if(head==null){
			insertAtFirst(data);
		}
		else{
			node.next=tail.next;
			tail.next=node;
			tail=node;
			size++;
		}
		
	}
	//---------------------------------------------------------------------------------	
	//---------------------------------------------------------------------------------	
	public String findElement(int data){
		Node node = new Node(data);
		Node temp=head;
		while(temp!=null){
			if(temp.data==node.data){
				return "Element Exsits";
			}
			temp=temp.next;
		}	
			return"Element Not Exsists";
	}
	//---------------------------------------------------------------------------------
	public void insertAtPosition(int data,int pos){
		Node node=new Node(data);
		
		Node prev = null;
		Node temp=head;
		if(size<pos){
			System.out.println("Index must be less than the size of the Linked list ");
			pos=size;
		}
		if(pos==0){
			insertAtFirst(data);
		}
		else{
			
			for(int i=1;i<pos;i++){
				prev=temp;
				temp=temp.next;
			}
			
			node.next=temp;
			
			prev.next=node;
			size++;
		}
		
	}
	//---------------------------------------------------------
	
	public void DeleteFirst(){
		if(head==null){
			return;
		}
		else{
			Node temp=head;
			head=temp.next;
			size--;
		}
		
	}
	//------------------------------------------------------------------------------
	public Node get(int index){
		Node node=head;
//		if(head==tail){
//			return head;
//		}
		for(int i=0;i<index;i++){
			node=node.next;
		}
		System.out.println(node.data);
		return node;
	}
	//------------------------------------------------------------------------------
	public void delete(int index){
		if(index==0){
			DeleteFirst();
		}
		if(index==size){
			deleteLast();
		}
		
		Node prev=get(index-1);
		
		prev.next=prev.next.next;
		size--;
		
	}
	public void deleteLast() {
		if(size<=1){
			DeleteFirst();
		}
		Node node=get(size-2);
		tail=node;
		tail.next=null;
		size--;
		
		
	}
	//---------------------------------------------------------------------------------
	public void display(){
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("END");
		//System.out.println("Size-->"+size);
		
	}
	
}
