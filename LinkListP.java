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
	int length() {
		Node after = head;
		int count = 0;
		while(after != null){
			after = after.next;
			count++;
		}
		return count;

	}
	boolean find(int x) {
		Node after = head;
		boolean result = false;
		int deploy;
		while(after.next!= null){
			after = after.next;
			if(after.data == x) {
				result = true;
				return true;
			}
		}
		return  result ;
	}

	boolean remove(int x) {
		Node after = head;
		boolean result = false;
		while(after.next!= null) {
			if(head.data == x){;
				head = after.next; 
				result = true;
			}
			if(after.data == x) {
				head.next = after.next.next;
				result = true;
				
		  	}
			if(after.next.data == x){
				after.next = after.next.next;
				if(head.next == null && head.data == x){
					head = null;
				}
			}
			else{ 
				after = after.next;
			}
		  	
		}	
		return result;
	}
}

class LinkListP{
	public static void main(String[] args) {
		
		LinkedList krystal = new LinkedList();


	 	krystal.push(4);
	 	krystal.print();

	 	
	 	krystal.push(2);
	 	krystal.print();

	 	krystal.push(3);
	 	krystal.print();

	 	System.out.println(krystal.pop());
	 	krystal.print();

	 	System.out.println(krystal.popBack());
	 	 krystal.print();

	 	krystal.pushFront(4);
	 	krystal.print();

		krystal.pushFront(4);
	 	krystal.print();

	 	krystal.push(6);
	 	krystal.print();

	 	krystal.push(4);
	 	krystal.print();

	 	System.out.println(krystal.length());
	 	System.out.println(krystal.find(2));
	 	System.out.println(krystal.find(90));
	 	System.out.println(krystal.remove(4));
	 	krystal.print();
	}

}
// else {
// 				if(after.next.next.data == x){
// 		  			after = after.next;
// 		  			result = true;
// 		  		if(after.next.data == x){
// 		  			after = after.next;
// 		  			}
// 		  		}	

