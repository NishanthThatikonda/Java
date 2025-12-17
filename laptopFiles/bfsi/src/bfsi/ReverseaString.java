package bfsi;
public class ReverseaString {
public static void main(String[] args) {
	String str="hello";
	char in[]= str.toCharArray();
	String rev=" ";
	for(int i=str.length()-1; i>=0;i--) {
		rev= rev+in[i];
		
	}
	if(str==rev) {
		System.out.println("it is a palindrome");
	}
	else {
		System.out.println("not a palindrome");
	}
	System.out.println(rev);
}
}
