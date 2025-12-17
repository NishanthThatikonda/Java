package Practice;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s ="hello world";
String[] arr= s.split(" ");
for(int i=arr.length-1; i>=0; i--) {
	if(arr[i]!=" ") {
		System.out.print(arr[i]+ " ");
	}
	
}
	}

}
