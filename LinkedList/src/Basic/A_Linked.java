package Basic;

class Node{
	int val;
	Node next; 
	Node(int val){
		this.val=val;
	}
	
}
public class A_Linked {

	public static void main(String[] args) {
		Node a=new Node(10); // head node
		Node b=new Node(20);
		Node c=new Node(30);
		Node d=new Node(40);
		Node e=new Node(50);
		// linking 
		a.next=b;
		b.next=c; 
		c.next=d;
		d.next=e;
		
		System.out.println(a.val+" "+a.next);
		System.out.println(b.val+" "+b.next);
		System.out.println(c.val+" "+c.next);
		System.out.println(d.val+" "+d.next);
		System.out.println(e.val+" "+e.next); // e is not linked so it will be null as default 
		
//		System.out.println(a.val+" "+a.next);
//		System.out.println(a.next.val);
//		System.out.println(a.next.next.val);
//		System.out.println(a.next.next.next.val);
//		System.out.println(a.next.next.next.next.val);
		
	}

}
