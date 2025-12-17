package Practice;
import java.util.*;
public class Vowels_consonents {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String scr=sc.nextLine();
int count_v=0;
int count_c=0;

for(int i=0; i<scr.length();i++) {
	char ch=scr.charAt(i);
	if(ch=='a' || ch=='e' || ch=='i'|| ch=='o'|| ch=='u'  ) {
		count_v++;
	}
	else {
		count_c++;
	}
}
	System.out.println(count_v);
	System.out.println(count_c);
}
}
