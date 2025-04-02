package doubly_Linked_List;

class DLL{
	dNode head;
	dNode tail;
	int size;
	void display() {  
		dNode temp=head;
		while(temp!=null) {
			System.out.print(temp.val+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	void insertAtHead(int val) {
		dNode temp=new dNode(val);
		if(size==0) head=tail=temp;
		else {
			head.prev=temp;
			temp.next=head;
			head=temp;
		}
		size++;
	} 
	void insertAtTail(int val) {
		dNode temp=new dNode(val);
		if(size==0) head=tail=temp;
		else {
			tail.next=temp;
			temp.prev=tail;
			tail=temp;
		}
		size++;
	} 
	void insert(int idx,int val) { 
		dNode temp=new dNode(val);
		// Base case
		if(idx==0) { 
			insertAtHead(val);
			return;
		}
		if(idx==size) {
			insertAtTail(val);
			return;
		}
		if(idx>size || idx<0) {
			System.out.println("Errror");
			return;
		}
		dNode x=head;
		for(int i=1;i<=idx-1;i++) {
			x=x.next;
		}
		// Insertion 
		dNode y=x.next;
		x.next=temp; temp.prev=x;
		y.prev=temp; temp.next=y;
		size++;
	}
	void deleteHead() throws Error {
		if(head==null) throw new Error("Error");
		head=head.next;
		head.prev=null;
		size--;
	}
	void deleteTail() throws Error{
		if(tail==null) throw new Error("ERROR");
		tail=tail.prev;
		tail.next=null;
		size--;
	}
	void delete(int idx) throws Error { 
		if(head==null) throw new Error("Empty List");
		if(idx>=size ) throw new Error("Invalid idx");
		if(idx==0) {
			deleteHead();
			return;
		}
		if(idx==size-1) {
			deleteTail();
			return;
		}
		dNode x=head;
		for(int i=0;i<idx-1;i++) {
			x=x.next;
		}
		if (x.next==tail) tail=x;
		dNode y=x.next.next;
		x.next=x.next.next;
		y.prev=y.prev.prev;
		size--;
	}
	void set(int idx,int val) throws Error{
		if(idx==size-1)  tail.val=val;	
	if(idx>=size || idx<0) throw new Error("BHAI ERROR");
	dNode temp=head;
	for(int i=0;i<idx;i++) {
		temp=temp.next;
	}
	temp.val=val;
	}
	int get(int idx) throws Error{
		if(idx==size-1) return tail.val;	
	if(idx>=size || idx<0)throw new Error("BHAI ERROR");
	dNode temp=head;
	for(int i=0;i<idx;i++) {
		temp=temp.next;
	}
	return temp.val;
	}
}
public class implementation {

	public static void main(String[] args) {
		DLL list=new DLL();
		list.insertAtTail(10);
		list.insertAtTail(20);
		list.insertAtTail(30);
		list.insertAtTail(40);
		list.display();
		list.insertAtHead(55);
		list.display(); 
		list.insert(2, 60);
		list.display();
		list.delete(5);
		list.display();
		list.set(2, 65);
		list.display();
		System.out.println("Val of 1st idx= "+list.get(0));
	}

}
