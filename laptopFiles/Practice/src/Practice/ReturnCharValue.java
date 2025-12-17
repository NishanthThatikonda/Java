package Practice;
import java.util.*;
public class ReturnCharValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
	char ch= sc.next().charAt(0);
	for(int i=0; i<str.length();i++) {
		if(str.charAt(i)==ch) {
			System.out.println(i);
			break;
		}
		
	}

	}

}
