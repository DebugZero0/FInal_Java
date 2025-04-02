package doubly_Linked_List;

import java.util.*;
class pll{
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
	void create(int val) {
		dNode temp=new dNode(val);
		if(size==0) head=tail=temp;
		else {
			tail.next=temp;
			temp.prev=tail;
			tail=temp;
		}
		size++;
	}
	boolean isPalindrome() {
		if(head.next==null) return true;
		dNode x=head;
		dNode y=tail;
		while(x!=y) {
			if(x.val!=y.val) return false;
			x=x.next;
			y=y.prev;
		}
		return true;
	}
}

public class palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		pll x=new pll();
		System.out.println("Enter Number of nodes you want to add:: ");
		int p=sc.nextInt();
		for(int i=1;i<=p;i++) {
			System.out.println("Enter Nodes::");
			x.create(sc.nextInt());
		}
		x.display();
		System.out.println(x.isPalindrome());
		
	}

}
