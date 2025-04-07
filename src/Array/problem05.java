package Array;

public class problem05 {

	public static void main(String[] args) {
		int [][] arr= {{1,3,5,7},{3,4,7,8},{1,4,12,3}};
		int max=0,row=0;
		for (int i = 0; i < arr.length; i++) {
			int s=0;
			for (int j = 0; j < arr[0].length; j++) {
				s+=arr[i][j];	
			}
			if(max<s) {
				max=s;
				row=i;
			}
		}
		System.out.println("The "+row+" row has the maximum sum: "+ max);
	}

}
