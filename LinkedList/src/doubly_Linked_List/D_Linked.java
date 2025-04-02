package doubly_Linked_List;

class dNode{
	int val;
	dNode next; 
	dNode prev;
	dNode(int val){
		this.val=val;
	}
 }

public class D_Linked {
	public static void printrev(dNode tail) {
		dNode temp=tail;
		while(temp!=null) {
			System.out.print(temp.val+" ");
			temp=temp.prev;
		}
		System.out.println();
	}
	public static void print(dNode head) {
		dNode temp=head;
		while(temp!=null) {
			System.out.print(temp.val+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	public static void printRandom(dNode node) {
		dNode temp=node;
		while(temp.prev!=null) {
			temp=temp.prev;
		}
		// Now temp is at head
		print(temp);
	}

	public static void main(String[] args) {
		dNode a=new dNode(10);
		dNode b=new dNode(20);
		dNode c=new dNode(30); 
		dNode d=new dNode(40);
		dNode e=new dNode(50);
		// Linking 
		a.next=b; b.prev=a;
		b.next=c; c.prev=b;
		c.next=d; d.prev=c;
		d.next=e; e.prev=d;
		print(a);
		printrev(e);
		printRandom(c);
	}

 }
