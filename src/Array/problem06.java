package Array;

public class problem06 {

	public static void main(String[] args) {
		int [][] arr= {{1,3,5,7,0},{3,4,7,8,3},{1,4,12,3,9},{3,4,7,8,3},{1,2,3,4,5}};
		int n=arr.length;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(i==(n)/2 || j==(n)/2) {
					System.out.print(arr[i][j]+" ");
				}
				else System.out.print("  ");
			}
			System.out.println();
		}
	}

}
