class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}
}

class LinkedList{
	Node head;


	LinkedList(){
		head = null;
		
	}
	
	void push(int val) {
		Node after;
		if(head == null) {
			head = new Node(val);		
			return;
		} 

		else {
			after = head;
			while(after.next != null){
				after = after.next;
			}
			after.next = new Node(val);
		}
	}
	
	void print(){
		Node after = head;
		while(after != null){
			System.out.print(after.data + " ");
			after = after.next;
		}
		System.out.println();
	}

}

class LinkList{
	public static void main(String[] args) {
		
		LinkedList krystal = new LinkedList();


	 	krystal.push(90);
	 	krystal.print();

	 	
	 	krystal.push(50);
	 	krystal.print();

	 	krystal.push(40);
	 	krystal.print();
	}
}

