package interview_practice;
import java.util.Scanner;
public class FindLargestNO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("enter yr frst no:");
int a = sc.nextInt();

System.out.println("enter yr 2nd no:");
int b = sc.nextInt();

System.out.println("enter yr 3rd no:");
int c = sc.nextInt();
if(a>b && a>c) {
	System.out.println(" a is largest no:"+a);
}
	else if(b>a && b>c) {
		System.out.println(" b is largest no:"+b);
	}
	else{	
		System.out.println(" c is largest no:"+c);
	
}
sc.close();
	}

}
