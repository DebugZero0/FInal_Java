package Array;

public class problem04 {

	public static void main(String[] args) {
		int [][] arr= {{1,2,-3,4},{0,0,-4,2},{1,-1,2,3},{-4,-5,-7,0}};
		int a=1,b=2,c=3,d=3,s=0;
		for (int i = a; i <= c; i++) {
			for (int j = b; j <= d; j++) {
				s+=arr[i][j];
			}
		}
		System.out.println(s);
	}

}
