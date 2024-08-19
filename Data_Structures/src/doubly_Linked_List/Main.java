package doubly_Linked_List;



public class Main {
	
	public static void main(String[] args) {
		DLL list = new DLL();
		
		list.insertAtEnd(1);
		list.insertAtEnd(2);
		list.insertAtEnd(3);
		list.insertAtEnd(4);
		list.insertAtEnd(5);
		list.insertAtEnd(6);
		list.insertAtEnd(7);
		list.insertAtEnd(8);
		list.insertFirst(100);
		list.insertFirst(12);
		list.insertFirst(34);
		list.insertAtEnd(9);
//		//list.DeleteFirst();
//		//list.insertAtPosition(10,2);
//		list.display();
//		//String  res=list.findElement(334);
//		//list.get(6);
//		list.deleteLast();
//		list.display();
//		list.delete(2);
		list.display();
		list.displyRev();
		
	}
}

