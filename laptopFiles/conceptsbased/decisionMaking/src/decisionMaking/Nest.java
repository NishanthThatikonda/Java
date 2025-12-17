package decisionMaking;

public class Nest {

	public static void main(String[] args) {
String status="pass";
if (status=="pass") {
	System.out.println("you cleared the first round");
}
	String round1exam="pass";
	if(round1exam=="pass") {
		System.out.println("ready for 2nd round");
		String round2exam="pass";
		if(round2exam=="pass") {
			System.out.println("Congratulations,You got the job");
		}
	
	else {
		System.out.println("go to home");
	}
}
	else {
		System.out.println("go to home");
	}
	}

	}
