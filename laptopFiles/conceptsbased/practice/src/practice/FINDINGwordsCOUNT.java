package practice;
import java.util.*;
public class FINDINGwordsCOUNT {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String r= sc.nextLine();
	int count=1;
	for(int i=0; i<r.length(); i++) {
			if((r.charAt(i)==' ') && (r.charAt(i+1)!=' ')) {
			count++;
		}
	}
	System.out.println(count);
}}
