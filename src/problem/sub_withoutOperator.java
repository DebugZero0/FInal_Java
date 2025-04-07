package problem;

import java.util.Scanner;

public class sub_withoutOperator {
	static int sub,add;
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two nos::");
		int a=sc.nextInt();
		int b=sc.nextInt();
		sub=a+~b+1; // SUBSTRACTION WITHOUT "-" OPERATOR
		add=a-(-b); // ADDITION WITHOUT "+" OPERATOR
		System.out.println(add);
		System.out.println(sub);
	}
}
