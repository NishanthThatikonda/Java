package array;

public class Two {

	public static void main(String[] args) {
int[][] arr= new int[3][2];
arr[0][0]=2;
arr[0][1]=5;
arr[1][0]=4;
arr[1][1]=3;
arr[2][0]=4;
arr[2][1]=3;
for(int i=0;i<arr.length; i++) {
	for(int j=0;j<arr[i].length; j++) {
		System.out.println(arr[i][j]+ " ");
	}
	System.out.println();

}

	}




}


