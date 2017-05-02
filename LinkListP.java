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
			while(after.next != null) {
				after = after.next;
			}
			after.next = new Node(val);
		}
	}
	
	void print(){
		Node after = head;
		while(after != null) {
			System.out.print(after.data + " ");
			after = after.next;
		}
		System.out.println();
	}

	public int pop() {
		int n = head.data; 
		head = head.next;
		return n;
		 
	}
	int popBack(){
		Node after = head;
		while(after.next.next != null) {
		 	after = after.next;
		}
		int number = after.next.data;
		after.next = null;
		
		return number;
		 
	}
	void pushFront(int val) {
		Node first = new Node(val);
		first.next = head;
		head = first;
	}

}

class LinkListP{
	public static void main(String[] args) {
		
		LinkedList krystal = new LinkedList();


	 	krystal.push(90);
	 	krystal.print();

	 	
	 	krystal.push(50);
	 	krystal.print();

	 	krystal.push(40);
	 	krystal.print();

	 	System.out.println(krystal.pop());
	 	krystal.print();

	 	System.out.println(krystal.popBack());
	 	krystal.print();

	 	krystal.pushFront(30);
	 	krystal.print();

		krystal.pushFront(360);
	 	krystal.print();
	}

}

