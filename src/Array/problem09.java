package Array;

public class problem09 {
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
		int n=arr.length;
		print(arr);
		for (int i = 0; i < arr.length; i++) {
			if(i%2==0) {
				for (int j = n-1; j >= 0; j--) {
					System.out.print(arr[j][i]+" ");
				}	
			}
			else {
				for (int j = 0; j <n; j++) {
					System.out.print(arr[j][i]+" ");
				}
			}
		}

	}
}
