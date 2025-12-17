package interview_practice;
import java.util.Scanner;
public class PrimeOrNOT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ur number:");
		int raju=sc.nextInt();
int num=raju;
int count=0;
if(num>1) {
 for(int i=1;i<=num;i++) {
	 if (num%i==0) { 
		 count++;
	 }
 }
	 if(count==2) {
		 System.out.println("given no is a prime no");
	 }
	 else 
	 { System.out.println("given no is not a prime no");
 }
	 
}
else {
System.out.println("given no is a palindrome no");
}
	}
}
