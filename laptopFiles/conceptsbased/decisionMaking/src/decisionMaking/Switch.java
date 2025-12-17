package decisionMaking;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter ur number");
				int number= scanner.nextInt();
switch(number) {
case 1:
System.out.println("given number is first number");
break;
case 2:
	System.out.println("given number is 2nd number");
	break;
case 3:
	System.out.println("given number is 3rd number");
	break;
	default:
		System.out.println("this is default statement");
		break;
		
	}

	}
}
