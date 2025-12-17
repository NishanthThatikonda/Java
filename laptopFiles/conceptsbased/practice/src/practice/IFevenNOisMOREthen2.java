package practice;
import java.util.*;

public class IFevenNOisMOREthen2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
int count=0;
int r=sc.nextInt();
while(r>0) {
	int rem= r%10;
	r=r/10;
	if(rem%2==0) {
		count++;
	}
}
if(count>2) {
	System.out.println("TRUE");
}
else {
	System.out.println("false");
}
	}

}
