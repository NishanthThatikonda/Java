package takeInputpFromUser;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in); 
		System.out.println("What is ur name");
		String name= scanner.nextLine();
		System.out.printf("hey %s,how are you ?",name );
		String Status=scanner.nextLine();
		System.out.println("enter ur age");
		int age=scanner.nextInt();
		System.out.println("Thanks for giving your information");
		scanner.close();
	}

}
