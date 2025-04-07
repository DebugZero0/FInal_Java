// Rotate the array 90-Degree anti clockwise 
package Array;

public class problem08 {
	public static void print(int[][]arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int [][]arr= {{1,2,3},{4,5,6},{7,8,9}};
		int n=arr[0].length;
		print(arr);
		for (int i = 0; i < arr.length; i++) {
			int b=n-1,a=0;
			while(a<=b) {
				int temp=arr[i][a];
				arr[i][a]=arr[i][b];
				arr[i][b]=temp;
				a++;
				b--;
			}
		}
		print(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		print(arr);
	}

}
