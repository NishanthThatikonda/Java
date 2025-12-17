package bfsi;
import java.util.*;
public class Primee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter the number : ");
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		boolean isFlage= true;
		if(num<=1) {
			isFlage= false;
		}else {
			for(int i=2; i<num; i++) {
				if(num%i==0) {
					isFlage=false;
					break;
			}
		}	
	}
		if(isFlage== true) {
			System.out.println("is prime number");
		}
		else {
			System.out.println(" Is not prime");
		}
		
		
	}

}
