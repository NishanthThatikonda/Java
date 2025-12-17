package Practice;
import java.util.*;
public class AverageOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the limit value:");

		int n=sc.nextInt();
		int sum=0;
		int count=0;
		System.out.println("enter the value:");

				int[] a= new int[n];
				for(int i=0;i<n;i++) {
					a[i]= sc.nextInt();
				}
				System.out.println("enter frst limit1:");
				int limit1=sc.nextInt();
				System.out.println("enter the 2nd limit value:");

				int limit2=sc.nextInt();
				for(int i=0; i<n;i++) {
					if(a[i]>limit1 && a[i]<limit2) {
						sum= sum+a[i];
						count++;
					}
				}
int average = sum/count;
System.out.println(average);
	}

}
