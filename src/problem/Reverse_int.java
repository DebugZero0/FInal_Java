package problem;
import java.util.*;
public class Reverse_int {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number::");
		int n=sc.nextInt(),p=1;
		while(n!=0) {
			p=n%10;
			n/=10;
			System.out.print(p);
		}	
	}
}
