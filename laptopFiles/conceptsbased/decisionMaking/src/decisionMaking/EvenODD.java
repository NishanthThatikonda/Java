package decisionMaking;

import java.util.Scanner;

public class EvenODD {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter ur number");
		int number=scanner.nextInt();
		if(number %2==0) {
			System.out.println("the given number is even");
		}
		else {
			System.out.println("the given number is odd");
		}
		scanner.close();
		}
	}


