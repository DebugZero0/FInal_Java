package Linked_list;

class Node{
	int val;
	Node y;
	Node(int val){
		this.val=val;
	}
}
public class linked {

	public static void main(String[] args) {
		Node a=new Node(58);
		Node b=new Node(60);
		Node c=new Node(89);
		// linking 
		a.y=b;
		b.y=c;
		c.y=a;
		System.out.println(a.val+" "+a.y);
		System.out.println(b.val+" "+b.y);
		System.out.println(c.val+" "+c.y);
	}

}
