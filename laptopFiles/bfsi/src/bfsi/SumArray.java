package bfsi;

public class SumArray {
public static void main(String[]args) {
	int arr[]= {1,3,4,6,7,8,9,0,3,3,33};
	int sum=0;
	for(int i=0; i<arr.length; i++) {
	sum= sum+arr[i];
	}
	System.out.println(sum);
}
}
