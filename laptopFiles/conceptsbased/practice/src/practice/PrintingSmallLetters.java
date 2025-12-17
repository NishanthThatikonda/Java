package practice;
import java.util.Scanner;

public class PrintingSmallLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the string:");
Scanner sc = new Scanner(System.in);
int count=0;
String r= sc.nextLine();
char[]arr= r.toCharArray();
for(int i=0;i<r.length();i++) {
	if(Character.isLowerCase(arr[i])){
		/* to print lower case letters then go for below print 
	System.out.print(arr[i]);*/
		count++;
	}
	
}
System.out.println(count);
	}
	
}
