//Reverse insertion sort
package Array;

import java.util.Arrays;

public class problem02 {

	public static void main(String[] args) {
		int []arr= {5,1,3,4,2};
		int n=arr.length;
		//Arrays.sort(arr);
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				//else break;
			}
		}
		//optimise it (Bad code)
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}

}
