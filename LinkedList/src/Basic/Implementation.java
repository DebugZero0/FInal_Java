package Basic;

class sll{ // User define data structure
	Node head;
	Node tail;
	int size;
	
	void AddHead(int val) { // Add Method At Head
		Node temp=new Node(val);
		if(head==null) head=tail=temp;
		else {
			temp.next=head;
			head=temp;
		}
		size++;
	}
	
	void AddTail(int val) { // Add Method At End
		Node temp=new Node(val);
		if(head==null) head=tail=temp;
		else {
			tail.next=temp;
			tail=temp;
		}
		size++;
	}
	
	void deleteHead() throws Error {
		if(head==null) throw new Error("Error");
		head=head.next;
		size--;
	}
	void deleteTail() throws Error{
		Node x=head;
		for(int i=0;i<size;i++) {
			x=x.next;
		}
		x.next=null;
		size--;
	}
	void insert(int idx,int val) { 
		Node temp=new Node(val);
		// Base case
		if(idx==0) {  
			AddHead(val);
			return;
		}
		if(idx==size) {
			AddTail(val);
			return;
		}
		if(idx>size || idx<0) {
			System.out.println("Errror");
			return;
		}
		Node x=head;
		for(int i=1;i<=idx-1;i++) {
			x=x.next;
		}
		// Insertion
		temp.next=x.next;
		x.next=temp;
		size++;
	}
	void delete(int idx) throws Error {
		if(head==null) throw new Error("Empty List");
		if(idx>=size ) throw new Error("Invalid idx");
		if(idx==0) deleteHead();
		if(idx==size) deleteTail();
		Node x=head;
		for(int i=0;i<idx-1;i++) {
			x=x.next;
		}
		if (x.next==tail) tail=x; 
		x.next=x.next.next;
		size--;
	}
	int get(int idx) throws Error{
		if(idx==size-1) return tail.val;	
	if(idx>=size || idx<0) {
		// return -1;
		throw new Error("BHAI ERROR");
	}
	Node temp=head;
	for(int i=0;i<idx;i++) {
		temp=temp.next;
	}
	return temp.val;
	}
	
	void set(int idx,int val) throws Error{
		if(idx==size-1)  tail.val=val;	
	if(idx>=size || idx<0) {
		// return -1;
		throw new Error("BHAI ERROR");
	}
	Node temp=head;
	for(int i=0;i<idx;i++) {
		temp=temp.next;
	}
	temp.val=val;
	}
	void print() { // Print Method .... 
		Node temp=head;
		while(temp!=null) { 
			System.out.print(temp.val+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	void printrec(Node head) {
		if(head==null) {
			System.out.println();
			return;
		}
		System.out.print(head.val+" ");
		printrec(head.next);
	}
	
}
public class Implementation {

	public static void main(String[] args) {
		sll list =new sll();
		list.AddTail(20);
		list.AddTail(30);
		list.AddTail(40);
		list.AddTail(60);
		list.print();
		list.AddHead(5);
		list.print();
		list.printrec(list.head);
		System.out.println("Size= "+list.size);
		list.AddTail(70);
		list.print();
		System.out.println("Size= "+list.size);
		list.insert(3,100);
		list.print();
		System.out.println("Size= "+list.size);
		System.out.println("Index 2 is "+list.get(2));
		//System.out.println("Index 2 is "+list.get(10));
		list.print();
		list.set(2,200);
		list.print();
		list.delete(6);
		list.print();
		//System.out.println(list.get(6));
		
	}
}
