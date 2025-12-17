package classs;
import java.util.*;

public class VOWELS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
String str= sc.nextLine();
int vowels=0;
int numbers=0;
int constants=0;
for(int i=0; i<str.length();i++) {
char c= str.charAt(i);
if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' ||c=='U') {
	vowels++;
	
}
else {
	constants++;
}
if(Character.isDigit(c)) {
	numbers++;
}

	}
System.out.println("numbers:" + numbers);
System.out.println("vowelws:" + vowels);
System.out.println("consonents" + constants);

	}
}
