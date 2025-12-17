package Practice;
import java.util.*;
public class SmallLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
int count=0;
String s=sc.nextLine();
for(int i=0; i<s.length(); i++) {
	char ch=s.charAt(i);
	if(ch>='a' && ch<='z') {
		count++;
	}
}
System.out.println(count);
	}

}
