package array;

public class two2 {

	public static void main(String[] args) {
int[][] arr= new int[3][2];
arr[0][0]=2;
arr[0][1]=5;

arr[1][0]=4;
arr[1][1]=3;


arr[2][0]=4;
arr[2][1]=3;


for(int i=0;i<arr.length; i++) {
	int[]SingleRow=arr[i];
	for(int j=0;j<SingleRow.length; j++) {
		System.out.println(SingleRow[j]+ " ");
	}
	System.out.println();

}
	}

}

