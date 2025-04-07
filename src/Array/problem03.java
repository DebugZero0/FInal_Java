// Print the Range of index whose sum equals target
package Array;

public class problem03 {

	public static void main(String[] args) {
		int []arr= {9,10,5,4,3,7};
		int n=arr.length;
		int target=12;
		for (int i = 0; i < arr.length; i++) {
			int sum=0;
				while(sum<target) {
					for (int j = i; j < arr.length; j++) {
					sum+=arr[j];
					if(sum==target) {
						System.out.println(i+" "+j); // 5+4+3=12 index: 2 To 4
						break;
					}
				}
			}
		}
	}

}
