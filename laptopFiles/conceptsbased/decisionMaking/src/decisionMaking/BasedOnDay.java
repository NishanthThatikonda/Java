package decisionMaking;

import java.util.Scanner;

public class BasedOnDay {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the day");
		String day=scanner.nextLine();
		String monday;
		day= "monday ||  tuesday || wednsday || thursday || friday";
		day= "monday ||  tuesday || wednsday || thursday || friday";
		if(day == "monday  tuesday  wednsday  thursday friday" ) {
			System.out.println("ohh, its a weekday");
		}
		else{
			System.out.println("yayy, it's a weekend");
		}
	}
	}

