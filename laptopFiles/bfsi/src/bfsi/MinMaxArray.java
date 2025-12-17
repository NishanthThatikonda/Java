package bfsi;

public class MinMaxArray {
public static void main(String[]args) {
	int[]arr= {1,4,55,7,55,8,9,988,22};
	int min=arr[0];
	int max=arr[0];
	for(int i=0; i<arr.length; i++) {
		if(arr[i]<min) {
			min=arr[i];
			
		}
		if(arr[i]>max) {
			max=arr[i];
		}
	}
	System.out.println("min number:" + min + " "+ "max number:" + max);
}
}
