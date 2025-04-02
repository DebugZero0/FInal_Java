package Basic;

public class display {
	public static void print(Node head) { // print by temp
		Node temp=head;
		while(temp!=null) { 
			System.out.println(temp.val);
			temp=temp.next;
		}
	}
	// OR 
	public static void displayRecursion(Node head) { // print by recursion 
		if(head==null) return;
		System.out.println(head.val);
		displayRecursion(head.next);
	}

	public static void main(String[] args) {
		Node a=new Node(100); // head node
		Node b=new Node(200);
		Node c=new Node(300);
		Node d=new Node(400);
		Node e=new Node(500);
		
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		print(a);
		displayRecursion(a);
//		Node tem =new Node(400);
//		System.out.println(tem.val+" "+tem.next);
		
//		Node temp=a; //shallow copy 
////  When we don't know how many nodes are present so while loop..also put advantage over deletion or addition
//		while(temp!=null) { 
//			System.out.println(temp.val);
//			temp=temp.next;
//		}
	}

}
