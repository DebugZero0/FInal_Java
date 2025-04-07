//WAP to pick the element which is at peak(greater than its neighbors)
package Array;

public class problem01 {

	public static void main(String[] args) {
		int []arr= {5,1,2,10,3,3,3,4,5,6};
		int n=arr.length;
		if(arr[0]>arr[1]) System.out.println(arr[0]);
		for (int i = 0; i < arr.length; i++) {
			if(i!=0 && i!=n-1) {
				if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1]) {
					System.out.println(arr[i]);
				}
			}
		}
		if(arr[n-1]>arr[n-2]) System.out.println(arr[n-1]);	
	}
}
