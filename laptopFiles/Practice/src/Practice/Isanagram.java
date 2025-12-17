package Practice;
import java.util.*;
public class Isanagram {

	public static boolean isAnagram(String s1, String s2) {
		// TODO Auto-generated method stub

String str1=s1.replaceAll(" ", "");
String str2=s2.replaceAll(" ", "");

if(s1.length()!= s2.length()) {
	return false;
}
else { 
	char[] ch1=s1.toLowerCase().toCharArray();
	char[] ch2=s2.toLowerCase().toCharArray();
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	return Arrays.equals(ch1, ch2);
	}
	
		 
	 }


	public static void main(String[] args) {
		System.out.println(isAnagram("Listen", "silent"));
	}
}

