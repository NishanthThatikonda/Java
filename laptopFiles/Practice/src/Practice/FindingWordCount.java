package Practice;
import java.util.*;
public class FindingWordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
String s= sc.nextLine();
int count=1;
for(int i=0; i<s.length()-1;i++) {
	char ch= s.charAt(i);
	if(ch==' ' & ch+1!=' ') {
		count++;
	}
}
System.out.println(count);
	}

}
