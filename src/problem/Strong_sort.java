package problem;

import java.util.Arrays;
import java.util.Scanner;

public class Strong_sort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String::");
		String s=sc.next();
		String []arr=new String[s.length()];
		for(int i=0;i<=s.length();i++) {
			arr[i]=sc.next();
		}
		//Arrays.sort(arr);
		for(String ele: arr) {
			System.out.println(ele);
		}
	}

}
//error
