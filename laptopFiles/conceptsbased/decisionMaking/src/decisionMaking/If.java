package decisionMaking;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("enter your value");
int NUMBER=scanner.nextInt();
/*in IF statements if conditions was true then only output will be appeared in console
 * if condition was not satisfied then we can get any output in console
 * if we want to get output for not satisfied condition use else statement
 */
if(NUMBER>0) {
	System.out.println("given number is positive number");
}
	}

}
