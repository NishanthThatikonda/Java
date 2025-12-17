package practice;
import java.util.*;


public class EVENpLACEcHARACTERpRINT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss= new Scanner(System.in);
System.out.println("enter ur string:");
String charr=ss.nextLine();
for(int i=0; i<charr.length(); i++) {
	if(i%2!=0) {
		System.out.print(charr.charAt(i));
	}
}
	}

}
