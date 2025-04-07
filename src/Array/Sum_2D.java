package Array;

public class Sum_2D {

	public static void main(String[] args) {
		int [][]arr= {{1,2,3},{4,5,6},{7,8,9}};
		int [][]brr= {{4,5,8},{0,0,8},{1,2,0}};
		int [][]srr=new int[3][3];
		for (int i = 0; i < srr.length; i++) {
			for (int j = 0; j < srr[0].length; j++) {
				srr[i][j]=arr[i][j]+brr[i][j];
			}
		}
		for (int i = 0; i < srr.length; i++) {
			for (int j = 0; j < srr.length; j++) {
				System.out.print(srr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
