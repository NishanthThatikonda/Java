package decisionMaking;

import java.util.Scanner;

public class Ifexample {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter your marks");
		int marks=scanner.nextInt();
		if(marks<35) {
			System.out.println("you are fail");
		}
		if(marks==35) {
			System.out.println("you are pass");
		}
		if (marks>=36 && marks<=70) {
			System.out.println("you are third class");
		}
		if (marks>70 && marks<=85) {
			System.out.println("u are second class");
		}
		if(marks>=85) {
			System.out.println("u are first class");
		}
	}


}