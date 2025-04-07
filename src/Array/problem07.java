package Array;

public class problem07 {

	public static void main(String[] args) {
		int [][]arr= {{1,2,3,4,8},{2,3,4,5,7},{3,4,5,6,9},{4,5,6,7,1},{0,9,5,2,6}};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(i==j || j==arr.length-i-1) System.out.print(arr[i][j]+" ");
				else System.out.print("  ");
			}
			System.out.println();
		}
	}

}
