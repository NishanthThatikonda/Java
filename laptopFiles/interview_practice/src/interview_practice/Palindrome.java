package interview_practice;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a value:");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
	int original_no=num;
	int var=0;
	while(num>0) {
		var=var*10+num%10;
		num=num/10;
	}
//	System.out.println(var);
		
	if(original_no==var) {
			System.out.println("given no is a palindrome");
		}
		else {
			System.out.println("given no is a NOTpalindrome");
		}
	sc.close();
	}
}
	


