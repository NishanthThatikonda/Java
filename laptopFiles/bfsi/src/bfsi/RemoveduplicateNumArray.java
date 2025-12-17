package bfsi;

public class RemoveduplicateNumArray {
public static void main(String[]args) {
	int arr[]= {1,1,4,5,6,4,8,9,9};
	
	
	for(int i=0; i<arr.length;i++) {
		boolean isDuplicate= false;
		for(int j=0;j<i; j++) {
			if(arr[i]==arr[j]) {
				isDuplicate= true;
				break;
			}
		}
			if(isDuplicate== false) {
				System.out.print(arr[i] + " ");
			}
		}
	}
	
	

}
