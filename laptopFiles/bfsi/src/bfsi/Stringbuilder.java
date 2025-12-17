package bfsi;

public class Stringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str= "radar";
String reversed= new StringBuilder(str).reverse().toString();
if(reversed.equals(reversed)) {
	System.out.println("it is a palindrome");
}
else {
	System.out.println("not palindrome");
}
	}

}
