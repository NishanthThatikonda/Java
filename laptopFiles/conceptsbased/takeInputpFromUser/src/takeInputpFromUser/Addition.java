package takeInputpFromUser;
import java.util.Scanner;
public class Addition {
	public static void main(String[] args) {
		int a,b,c;
Scanner r=new Scanner(System.in);
System.out.println("enter first number:");
a=r.nextInt();
System.out.println("enter 2nd number:");
b=r.nextInt();
c=a+b;
System.out.println(c);
	}

}
